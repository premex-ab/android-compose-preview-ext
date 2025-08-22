package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Skyevo device specifications for Android Compose previews.
 *
 * This extension provides Skyevo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Skyevo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Skyevo get() = object {
    /** Skyevo Elite L55 */
    val ELITE_L55 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Skyevo Elite OctaPlus */
    val ELITE_OCTAPLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Skyevo Elite OctaX */
    val ELITE_OCTAX = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Skyevo Elite_OctaXS */
    val ELITE_OCTAXS = "spec:width=800,height=1280,unit=px,dpi=213"

}
