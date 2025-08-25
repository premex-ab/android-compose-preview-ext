package se.premex.compose.preview.generator.generator

import se.premex.compose.preview.generator.model.DeviceSpec
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.writeText

/**
 * Generates Markdown documentation for supported devices.
 * Structure:
 * docs/devices/README.md (overview + links)
 * docs/devices/<Manufacturer>.md (per manufacturer details)
 * Optionally updates root README.md statistics between markers.
 */
class DeviceDocsGenerator {

    fun generate(devices: List<DeviceSpec>, projectRoot: Path) {
        if (devices.isEmpty()) return
        val docsRoot = projectRoot.resolve("docs/devices")
        if (!docsRoot.exists()) docsRoot.createDirectories()

        // Group & sort
        val byManufacturer = devices.groupBy { it.toManufacturerClassName() }
            .toSortedMap()

        // Generate per-manufacturer pages first (need counts & names)
        val manufacturerSummaries = mutableListOf<ManufacturerSummary>()
        byManufacturer.forEach { (manufacturerClassName, specsRaw) ->
            val specs = specsRaw
                .distinctBy { it.code + ":" + it.toDeviceString() }
                .sortedWith(compareBy<DeviceSpec> { it.code.lowercase() }.thenBy { it.width }.thenBy { it.height }.thenBy { it.dpi })

            val usedNames = mutableSetOf<String>()
            val rows = specs.map { spec ->
                val constName = resolveUniqueName(spec, usedNames)
                DeviceRow(
                    manufacturerClassName = manufacturerClassName,
                    code = spec.code,
                    constName = constName,
                    specString = spec.toDeviceString(),
                    width = spec.width,
                    height = spec.height,
                    dpi = spec.dpi,
                    isGoogle = spec.isGoogleDevice
                )
            }
            manufacturerSummaries += ManufacturerSummary(manufacturerClassName, specs.first().manufacturer, rows.size)
            writeManufacturerFile(docsRoot, manufacturerClassName, rows)
        }

        writeOverviewFile(docsRoot, manufacturerSummaries.sortedBy { it.displayName.lowercase() }, devices.size)
        updateRootReadme(projectRoot, devices.size, manufacturerSummaries.size)
        println("[INFO] Generated device docs in ${docsRoot} (manufacturers=${manufacturerSummaries.size}, devices=${devices.size}).")
    }

    private fun writeOverviewFile(docsRoot: Path, manufacturers: List<ManufacturerSummary>, totalDevices: Int) {
        val content = buildString {
            appendLine("# Supported Devices")
            appendLine()
            appendLine("This catalog currently includes **${totalDevices}** device specs across **${manufacturers.size}** manufacturers.")
            appendLine()
            appendLine("| Manufacturer | Devices | Link |")
            appendLine("|--------------|---------|------|")
            manufacturers.forEach { m ->
                appendLine("| ${m.displayName} | ${m.deviceCount} | [Details](./${m.className}.md) |")
            }
            appendLine()
            appendLine("<!-- Generated automatically. Run the device generator to refresh: `./gradlew :device-generator:run`. Do not edit manually. -->")
        }
        docsRoot.resolve("README.md").writeText(content)
    }

    private fun writeManufacturerFile(docsRoot: Path, manufacturerClassName: String, rows: List<DeviceRow>) {
        val content = buildString {
            val displayName = rows.firstOrNull()?.manufacturerClassName ?: manufacturerClassName
            appendLine("# $displayName Devices")
            appendLine()
            appendLine("Total: **${rows.size}** devices. Import: `import se.premex.compose.preview.device.catalog.android.${manufacturerClassName}`")
            appendLine()
            appendLine("| Code | Constant | Resolution | DPI | Compose Spec | Preview Usage |")
            appendLine("|------|----------|------------|-----|-------------|---------------|")
            rows.forEach { r ->
                val res = if (r.specString.startsWith("id:")) "(Google ID)" else "${r.width}x${r.height}"
                val usage = "@Preview(device = ${manufacturerClassName}.${r.constName})"
                appendLine("| ${r.code} | ${r.constName} | ${res} | ${r.dpi} | `${r.specString}` | `${usage}` |")
            }
            appendLine()
            appendLine("<!-- Generated automatically. Do not edit manually. -->")
        }
        docsRoot.resolve("${manufacturerClassName}.md").writeText(content)
    }

    private fun updateRootReadme(projectRoot: Path, totalDevices: Int, manufacturers: Int) {
        val readme = projectRoot.resolve("README.md")
        if (!Files.exists(readme)) return
        val text = Files.readString(readme)
        val start = "<!-- SUPPORTED_DEVICE_STATS_START -->"
        val end = "<!-- SUPPORTED_DEVICE_STATS_END -->"
        if (text.contains(start) && text.contains(end)) {
            val newStats = "Total devices: **${totalDevices}** across **${manufacturers}** manufacturers. See the full list: [Supported Devices](docs/devices/README.md)."
            val updated = text.replace(Regex("${Regex.escape(start)}[\\s\\S]*?${Regex.escape(end)}")) {
                "${start}\n${newStats}\n${end}"
            }
            if (updated != text) {
                Files.writeString(readme, updated)
            }
        }
    }

    // Duplicate of naming logic to stay consistent with code constants
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
        return md.digest(input.toByteArray()).take(3).joinToString("") { (it.toInt() and 0xFF).toString(16).padStart(2, '0') }.uppercase()
    }

    private data class DeviceRow(
        val manufacturerClassName: String,
        val code: String,
        val constName: String,
        val specString: String,
        val width: Int,
        val height: Int,
        val dpi: Int,
        val isGoogle: Boolean
    )

    private data class ManufacturerSummary(
        val className: String,
        val displayName: String,
        val deviceCount: Int
    )
}

