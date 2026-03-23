package se.premex.compose.preview.generator.generator

import se.premex.compose.preview.generator.model.DeviceSpec
import java.nio.file.Files
import java.nio.file.Path
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

        // Group & sort (case-insensitive to match DeviceCatalogGenerator)
        val byManufacturer = NameResolver.groupByManufacturer(devices)

        // Generate per-manufacturer pages first (need counts & names)
        val manufacturerSummaries = mutableListOf<ManufacturerSummary>()
        byManufacturer.forEach { (manufacturerClassName, specsRaw) ->
            val specs = specsRaw
                .distinctBy { it.code + ":" + it.toDeviceString() }
                .sortedWith(compareBy<DeviceSpec> { it.code.lowercase() }.thenBy { it.width }.thenBy { it.height }.thenBy { it.dpi })

            val rows = NameResolver.resolveAllNames(specs).map { (spec, constName) ->
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

