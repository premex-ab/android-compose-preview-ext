package se.premex.compose.preview.generator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import se.premex.compose.preview.generator.model.DeviceSpec
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.createDirectories
import kotlin.io.path.exists

/**
 * Generates one preview group file per manufacturer in the `groups` subpackage.
 *
 * Each file contains a Kotlin object (e.g. `ZebraDevices`) with a `val ALL` property
 * holding an array of all device spec strings for that manufacturer.  Users can iterate
 * over the array in screenshot tests or other tooling that needs to cover every device.
 *
 * Generated package: `se.premex.compose.preview.device.catalog.android.groups`
 * Example usage:
 * ```kotlin
 * ZebraDevices.ALL.forEach { deviceSpec ->
 *     // e.g. run a screenshot test on each device
 * }
 * ```
 */
class PreviewGroupGenerator {

    private val basePackage = "se.premex.compose.preview.device.catalog.android"
    private val groupsPackage = "$basePackage.groups"

    fun generate(devices: List<DeviceSpec>, outputPath: Path) {
        val byManufacturer = devices.groupBy { it.toManufacturerClassName() }.toSortedMap()

        val groupsDir = outputPath.resolve(groupsPackage.replace('.', '/'))
        if (!groupsDir.exists()) groupsDir.createDirectories()

        byManufacturer.forEach { (manufacturerClassName, specs) ->
            val uniqueSpecs = specs
                .distinctBy { it.code + ":" + it.toDeviceString() }
                .sortedWith(compareBy<DeviceSpec> { it.code.lowercase() }.thenBy { it.width }.thenBy { it.height }.thenBy { it.dpi })

            val usedNames = mutableSetOf<String>()
            val constRefs = uniqueSpecs.map { spec ->
                val constName = resolveUniqueName(spec, usedNames)
                usedNames += constName
                MemberName(ClassName(basePackage, manufacturerClassName), constName)
            }

            val groupObjectName = "${manufacturerClassName}Devices"
            val displayName = specs.first().manufacturer

            val arrayExpr = constRefs.joinToString(",\n        ") { ref ->
                "${manufacturerClassName}.${ref.simpleName}"
            }

            // Build the object with a hand-crafted initializer to keep it readable
            val allProp = PropertySpec.builder("ALL", Array<String>::class.asTypeName())
                .addKdoc(
                    "All %L device specs (%L models). " +
                            "Each element is a valid `device` string for `@Preview(device = …)`.",
                    displayName, uniqueSpecs.size
                )
                .addAnnotation(JvmField::class)
                .initializer("arrayOf(\n        %L\n    )", arrayExpr)
                .build()

            val groupObject = TypeSpec.objectBuilder(groupObjectName)
                .addKdoc(
                    "Preview group for %L (%L models).\n\n" +
                            "Contains all supported %L device spec strings so you can easily\n" +
                            "iterate over every device in screenshot tests or other tooling.\n",
                    displayName, uniqueSpecs.size, displayName
                )
                .addProperty(allProp)
                .build()

            FileSpec.builder(groupsPackage, groupObjectName)
                .addFileComment(
                    "Generated preview group. Manufacturer=%L Devices=%L",
                    manufacturerClassName, uniqueSpecs.size
                )
                .addImport(basePackage, manufacturerClassName)
                .addType(groupObject)
                .build()
                .writeTo(outputPath.toFile())
        }

        println(
            "[INFO] Generated ${byManufacturer.size} preview group files in package $groupsPackage."
        )
    }

    // ---- naming helpers (mirrors DeviceCatalogGenerator) --------------------------------

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

    private fun String.sanitizeUnderscores(): String =
        this.replace(Regex("__+"), "_").trimEnd('_')

    private fun shortHash(input: String): String {
        val md = MessageDigest.getInstance("MD5")
        val bytes = md.digest(input.toByteArray())
        return bytes.take(3).joinToString("") { (it.toInt() and 0xFF).toString(16).padStart(2, '0') }.uppercase()
    }
}
