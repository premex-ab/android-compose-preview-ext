package se.premex.compose.preview.generator.generator

import com.squareup.kotlinpoet.*
import se.premex.compose.preview.generator.model.DeviceSpec
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.exists

/**
 * Generates one file per manufacturer.
 * Each file contains a single object named after the manufacturer with device specification constants.
 */
class DeviceCatalogGenerator {
    fun generate(devices: List<DeviceSpec>, outputPath: Path) {
        val allDevices = devices
        val byManufacturer = NameResolver.groupByManufacturer(allDevices)

        val basePackage = "se.premex.compose.preview.device.catalog.android"
        val kotlinSrcRoot = outputPath
        val baseDir = kotlinSrcRoot.resolve(basePackage.replace('.', '/'))
        if (!baseDir.exists()) baseDir.createDirectories()

        byManufacturer.forEach { (manufacturerClassName, specs) ->
            val uniqueSpecs = specs
                .distinctBy { it.code + ":" + it.toDeviceString() }
                .sortedWith(compareBy<DeviceSpec> { it.code.lowercase() }.thenBy { it.width }.thenBy { it.height }.thenBy { it.dpi })

            val manufacturerObject = TypeSpec.objectBuilder(manufacturerClassName)
                .addKdoc("Device specifications for ${specs.first().manufacturer} (${uniqueSpecs.size} models).")

            NameResolver.resolveAllNames(uniqueSpecs).forEach { (spec, constName) ->
                manufacturerObject.addProperty(
                    PropertySpec.builder(constName, String::class, KModifier.CONST)
                        .initializer("\"${spec.toDeviceString()}\"")
                        .addKdoc("${spec.manufacturer} ${spec.code}")
                        .build()
                )
            }

            FileSpec.builder(basePackage, manufacturerClassName)
                .addFileComment("Generated manufacturer device catalog. Devices=${uniqueSpecs.size}")
                .addType(manufacturerObject.build())
                .build()
                .writeTo(kotlinSrcRoot.toFile())
        }
        println("[INFO] Generated ${byManufacturer.size} manufacturer device files. Total devices=${allDevices.size}. No unified DeviceCatalog generated.")
    }

}
