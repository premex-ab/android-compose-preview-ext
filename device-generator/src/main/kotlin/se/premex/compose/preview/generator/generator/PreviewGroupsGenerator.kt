package se.premex.compose.preview.generator.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import se.premex.compose.preview.generator.model.DeviceSpec
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.exists

/**
 * Generates preview groups functionality for device collections grouped by manufacturer.
 */
class PreviewGroupsGenerator {
    
    fun generate(devices: List<DeviceSpec>, outputPath: Path) {
        val basePackage = "se.premex.compose.preview.groups"
        val kotlinSrcRoot = outputPath
        val baseDir = kotlinSrcRoot.resolve(basePackage.replace('.', '/'))
        if (!baseDir.exists()) baseDir.createDirectories()
        
        // Group devices by manufacturer
        val byManufacturer = devices.groupBy { it.toManufacturerClassName() }.toSortedMap()
        
        // Generate main PreviewGroups class
        generatePreviewGroupsClass(byManufacturer, basePackage, kotlinSrcRoot)
        
        // Generate specific manufacturer group classes (like ZebraPreviewGroup)
        byManufacturer.forEach { (manufacturerClassName, specs) ->
            if (manufacturerClassName == "Zebra") {
                generateZebraPreviewGroupClass(specs, basePackage, kotlinSrcRoot)
            }
            // Add more specific manufacturer classes here as needed
        }
        
        println("[INFO] Generated PreviewGroups classes for ${byManufacturer.size} manufacturers.")
    }
    
    private fun generatePreviewGroupsClass(
        byManufacturer: Map<String, List<DeviceSpec>>, 
        basePackage: String, 
        kotlinSrcRoot: Path
    ) {
        val previewGroupsClass = TypeSpec.objectBuilder("PreviewGroups")
            .addKdoc("Preview Groups utility providing collections of device specifications grouped by brand.\n\nThis enables developers to easily access all devices from a specific manufacturer\nfor comprehensive UI testing and preview generation.")
        
        // Add individual manufacturer methods
        byManufacturer.forEach { (manufacturerClassName, specs) ->
            val uniqueSpecs = specs
                .distinctBy { it.code + ":" + it.toDeviceString() }
                .sortedWith(compareBy<DeviceSpec> { it.code.lowercase() }.thenBy { it.width }.thenBy { it.height }.thenBy { it.dpi })
            
            val methodName = "get${manufacturerClassName}Devices"
            val manufacturerName = specs.first().manufacturer
            
            val methodBuilder = FunSpec.builder(methodName)
                .addKdoc("Get all device specifications for $manufacturerName devices.\nUseful for ${if (manufacturerClassName == "Zebra") "enterprise and rugged device" else manufacturerName.lowercase()} testing.")
                .returns(List::class.asClassName().parameterizedBy(String::class.asClassName()))
            
            // Build the device constants as string list
            methodBuilder.addCode("return listOf(\n")
            uniqueSpecs.forEachIndexed { index, spec ->
                val constName = resolveConstantName(spec)
                val comma = if (index < uniqueSpecs.size - 1) "," else ""
                methodBuilder.addCode("    %T.$constName$comma\n", ClassName("se.premex.compose.preview.device.catalog.android", manufacturerClassName))
            }
            methodBuilder.addCode(")\n")
            
            previewGroupsClass.addFunction(methodBuilder.build())
        }
        
        // Create a private property with brand map for efficient lookup
        val mapInitializer = CodeBlock.builder()
        mapInitializer.add("mapOf(\n")
        
        byManufacturer.keys.forEachIndexed { index, manufacturerClassName ->
            val brandName = manufacturerClassName.lowercase()
            val comma = if (index < byManufacturer.size - 1) "," else ""
            mapInitializer.add("    \"$brandName\" to ::get${manufacturerClassName}Devices$comma\n")
        }
        mapInitializer.add(")")
        
        val brandMapProperty = PropertySpec.builder(
            "brandMap",
            ClassName("kotlin.collections", "Map").parameterizedBy(
                String::class.asClassName(),
                LambdaTypeName.get(returnType = List::class.asClassName().parameterizedBy(String::class.asClassName()))
            )
        )
            .addModifiers(KModifier.PRIVATE)
            .initializer(mapInitializer.build())
            .build()
        
        previewGroupsClass.addProperty(brandMapProperty)
        
        // Add getDevicesForBrand method that uses the map
        val getDevicesForBrandMethod = FunSpec.builder("getDevicesForBrand")
            .addKdoc("Get device specifications for a specific brand.\n\n@param brandName The name of the brand (case-insensitive)\n@return List of device specification strings for the brand, or empty list if brand not found")
            .addParameter("brandName", String::class)
            .returns(List::class.asClassName().parameterizedBy(String::class.asClassName()))
            .addCode("return brandMap[brandName.lowercase()]?.invoke() ?: emptyList()\n")
        
        previewGroupsClass.addFunction(getDevicesForBrandMethod.build())
        
        // Add getSupportedBrands method
        val getSupportedBrandsMethod = FunSpec.builder("getSupportedBrands")
            .addKdoc("Get names of all supported brands with preview groups.")
            .returns(List::class.asClassName().parameterizedBy(String::class.asClassName()))
            .addCode("return brandMap.keys.sorted()\n")
        
        previewGroupsClass.addFunction(getSupportedBrandsMethod.build())
        
        val fileSpec = FileSpec.builder(basePackage, "PreviewGroups")
            .addFileComment("Generated Preview Groups utility. Manufacturers=${byManufacturer.size}")
            .addType(previewGroupsClass.build())
        
        // Add imports for all manufacturer classes
        byManufacturer.keys.forEach { manufacturerClassName ->
            fileSpec.addImport("se.premex.compose.preview.device.catalog.android", manufacturerClassName)
        }
        
        fileSpec.build().writeTo(kotlinSrcRoot.toFile())
    }
    
    private fun generateZebraPreviewGroupClass(
        specs: List<DeviceSpec>, 
        basePackage: String, 
        kotlinSrcRoot: Path
    ) {
        val uniqueSpecs = specs
            .distinctBy { it.code + ":" + it.toDeviceString() }
            .sortedWith(compareBy<DeviceSpec> { it.code.lowercase() }.thenBy { it.width }.thenBy { it.height }.thenBy { it.dpi })
        
        // Categorize Zebra devices based on their model codes
        val handhelds = mutableListOf<DeviceSpec>()
        val touchComputers = mutableListOf<DeviceSpec>()
        val tablets = mutableListOf<DeviceSpec>()
        val vehicleComputers = mutableListOf<DeviceSpec>()
        val wearables = mutableListOf<DeviceSpec>()
        val others = mutableListOf<DeviceSpec>()
        
        uniqueSpecs.forEach { spec ->
            val code = spec.code.uppercase()
            when {
                code.startsWith("MC") -> handhelds.add(spec)
                code.startsWith("TC") -> touchComputers.add(spec) 
                code.startsWith("ET") || code.startsWith("L10") -> tablets.add(spec)
                code.startsWith("VC") -> vehicleComputers.add(spec)
                code.startsWith("WT") -> wearables.add(spec)
                else -> others.add(spec)
            }
        }
        
        val zebraPreviewGroupClass = TypeSpec.objectBuilder("ZebraPreviewGroup")
            .addKdoc("Zebra device preview group providing categorized access to Zebra's enterprise device catalog.\n\nThis utility organizes ${uniqueSpecs.size} Zebra devices into logical categories based on their intended use cases,\nmaking it easier to target specific device types for enterprise application testing.")
        
        // Add Categories object
        val categoriesObject = TypeSpec.objectBuilder("Categories")
            .addKdoc("Device categories organized by Zebra product lines and use cases.")
        
        // Add category lists
        if (handhelds.isNotEmpty()) {
            categoriesObject.addProperty(createCategoryProperty("handhelds", handhelds, "Mobile computers and handheld scanners (MC series)", "Zebra"))
        }
        if (touchComputers.isNotEmpty()) {
            categoriesObject.addProperty(createCategoryProperty("touchComputers", touchComputers, "Touch computers and mobile devices (TC series)", "Zebra"))
        }
        if (tablets.isNotEmpty()) {
            categoriesObject.addProperty(createCategoryProperty("tablets", tablets, "Enterprise tablets (ET series)", "Zebra"))
        }
        if (vehicleComputers.isNotEmpty()) {
            categoriesObject.addProperty(createCategoryProperty("vehicleComputers", vehicleComputers, "Vehicle-mounted computers (VC series)", "Zebra"))
        }
        if (wearables.isNotEmpty()) {
            categoriesObject.addProperty(createCategoryProperty("wearables", wearables, "Wearable computers and devices (WT series)", "Zebra"))
        }
        if (others.isNotEmpty()) {
            categoriesObject.addProperty(createCategoryProperty("others", others, "Other Zebra devices", "Zebra"))
        }
        
        zebraPreviewGroupClass.addType(categoriesObject.build())
        
        val fileSpec = FileSpec.builder(basePackage, "ZebraPreviewGroup")
            .addFileComment("Generated Zebra Preview Group utility. Categories=${listOf(handhelds, touchComputers, tablets, vehicleComputers, wearables, others).count { it.isNotEmpty() }}, Devices=${uniqueSpecs.size}")
            .addImport("se.premex.compose.preview.device.catalog.android", "Zebra")
            .addType(zebraPreviewGroupClass.build())
            .build()
            .writeTo(kotlinSrcRoot.toFile())
    }
    
    private fun createCategoryProperty(
        propertyName: String,
        devices: List<DeviceSpec>,
        description: String,
        manufacturerClassName: String
    ): PropertySpec {
        val propertyBuilder = PropertySpec.builder(propertyName, List::class.asClassName().parameterizedBy(String::class.asClassName()))
            .addKdoc("$description (${devices.size} devices)")
        
        // Build the device list with CodeBlock
        val codeBlockBuilder = CodeBlock.builder()
        codeBlockBuilder.add("listOf(\n")
        devices.forEachIndexed { index, spec ->
            val constName = resolveConstantName(spec)
            val comma = if (index < devices.size - 1) "," else ""
            codeBlockBuilder.add("        %T.$constName$comma\n", ClassName("se.premex.compose.preview.device.catalog.android", manufacturerClassName))
        }
        codeBlockBuilder.add("    )")
        
        propertyBuilder.initializer(codeBlockBuilder.build())
        
        return propertyBuilder.build()
    }
    
    private fun resolveConstantName(spec: DeviceSpec): String {
        return spec.toConstantName()
    }
}