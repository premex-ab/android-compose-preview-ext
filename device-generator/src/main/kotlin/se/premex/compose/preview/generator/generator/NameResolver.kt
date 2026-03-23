package se.premex.compose.preview.generator.generator

import se.premex.compose.preview.generator.model.DeviceSpec
import java.security.MessageDigest

/**
 * Shared name resolution logic for generating unique constant names.
 * Used by both DeviceCatalogGenerator and PreviewGroupsGenerator to ensure consistent naming.
 */
object NameResolver {
    /**
     * Groups devices by manufacturer class name, merging names that differ only in casing.
     * This prevents case-insensitive filesystem collisions (e.g., "AlphaLing" vs "Alphaling").
     * Returns a sorted map with the first-seen class name as the canonical key.
     */
    fun groupByManufacturer(devices: List<DeviceSpec>): Map<String, List<DeviceSpec>> {
        val canonicalNames = mutableMapOf<String, String>() // lowercase -> first-seen PascalCase
        val groups = mutableMapOf<String, MutableList<DeviceSpec>>()

        for (device in devices) {
            val className = device.toManufacturerClassName()
            val key = className.lowercase()
            val canonical = canonicalNames.getOrPut(key) { className }
            groups.getOrPut(canonical) { mutableListOf() }.add(device)
        }

        return groups.toSortedMap()
    }

    fun resolveUniqueName(spec: DeviceSpec, used: MutableSet<String>): String {
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

    /**
     * Resolves unique names for a list of specs (already deduped and sorted).
     * Returns a list of pairs: (spec, resolvedConstantName).
     */
    fun resolveAllNames(specs: List<DeviceSpec>): List<Pair<DeviceSpec, String>> {
        val usedNames = mutableSetOf<String>()
        return specs.map { spec -> spec to resolveUniqueName(spec, usedNames) }
    }

    private fun String.sanitizeUnderscores(): String = this.replace(Regex("__+"), "_").trimEnd('_')

    private fun shortHash(input: String): String {
        val md = MessageDigest.getInstance("MD5")
        val bytes = md.digest(input.toByteArray())
        return bytes.take(3).joinToString("") { (it.toInt() and 0xFF).toString(16).padStart(2, '0') }.uppercase()
    }
}
