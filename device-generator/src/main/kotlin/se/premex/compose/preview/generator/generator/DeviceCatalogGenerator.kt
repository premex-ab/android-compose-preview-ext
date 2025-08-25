package se.premex.compose.preview.generator.generator

import com.squareup.kotlinpoet.*
import se.premex.compose.preview.generator.model.DeviceSpec
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.createDirectories
import kotlin.io.path.exists

/**
 * Generates one file per manufacturer.
 * Each file contains a single object named after the manufacturer with device specification constants.
 */
class DeviceCatalogGenerator {
    fun generate(devices: List<DeviceSpec>, outputPath: Path) {
        val allDevices = devices
        val byManufacturer = allDevices.groupBy { it.toManufacturerClassName() }.toSortedMap()

        val basePackage = "se.premex.compose.preview.device.catalog.android"
        val kotlinSrcRoot = outputPath
        val baseDir = kotlinSrcRoot.resolve(basePackage.replace('.', '/'))
        if (!baseDir.exists()) baseDir.createDirectories()

        byManufacturer.forEach { (manufacturerClassName, specs) ->
            val uniqueSpecs = specs
                .distinctBy { it.code + ":" + it.toDeviceString() }
                .sortedWith(compareBy<DeviceSpec> { it.code.lowercase() }.thenBy { it.width }.thenBy { it.height }.thenBy { it.dpi })

            val usedNames = mutableSetOf<String>()
            val manufacturerObject = TypeSpec.objectBuilder(manufacturerClassName)
                .addKdoc("Device specifications for ${specs.first().manufacturer} (${uniqueSpecs.size} models).")

            uniqueSpecs.forEach { spec ->
                val constName = resolveUniqueName(spec, usedNames)
                manufacturerObject.addProperty(
                    PropertySpec.builder(constName, String::class, KModifier.CONST)
                        .initializer("\"${spec.toDeviceString()}\"")
                        .addKdoc("${spec.manufacturer} ${spec.code}")
                        .build()
                )
                usedNames += constName
            }

            FileSpec.builder(basePackage, manufacturerClassName)
                .addFileComment("Generated manufacturer device catalog. Devices=${uniqueSpecs.size}")
                .addType(manufacturerObject.build())
                .build()
                .writeTo(kotlinSrcRoot.toFile())
        }
        println("[INFO] Generated ${byManufacturer.size} manufacturer device files. Total devices=${allDevices.size}. No unified DeviceCatalog generated.")
    }

    private fun resolveUniqueName(spec: DeviceSpec, used: MutableSet<String>): String {
        val base = spec.toConstantName()
        if (used.add(base)) return base
        val resSuffix = "${spec.width}X${spec.height}".uppercase()
        val resCandidate = "${base}_${resSuffix}".sanitizeUnderscores()
        if (used.add(resCandidate)) return resCandidate
        val dpiCandidate = "${base}_${resSuffix}_${spec.dpi}DPI".sanitizeUnderscores()
        if (used.add(dpiCandidate)) return dpiCandidate
        val hash = shortHash(spec.code + spec.width + spec.height + spec.dpi)
        val hashCandidate = "${base}_${hash}".sanitizeUnderscores()
        if (used.add(hashCandidate)) return hashCandidate
        var counter = 2
        while (true) {
            val candidate = "${base}_${counter}".sanitizeUnderscores()
            if (used.add(candidate)) return candidate
            counter++
        }
    }

    private fun String.sanitizeUnderscores(): String = this.replace(Regex("__+"), "_").trimEnd('_')

    private fun shortHash(input: String): String {
        val md = MessageDigest.getInstance("MD5")
        val bytes = md.digest(input.toByteArray())
        return bytes.take(3).joinToString("") { (it.toInt() and 0xFF).toString(16).padStart(2, '0') }.uppercase()
    }
}
