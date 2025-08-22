package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Willkotech device specifications for Android Compose previews.
 *
 * This extension provides Willkotech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Willkotech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Willkotech get() = object {
    /** Willkotech Kishi-001 */
    val KISHI_001 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Willkotech WK1863L */
    val WK1863L = "spec:width=800,height=1280,unit=px,dpi=160"

}
