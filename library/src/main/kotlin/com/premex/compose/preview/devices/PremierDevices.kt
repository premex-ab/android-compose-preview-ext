package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Premier device specifications for Android Compose previews.
 *
 * This extension provides Premier device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Premier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Premier get() = object {
    /** Premier MAXI 20 */
    val MAXI_20 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Premier Premier_P50 */
    val PREMIER_P50 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Premier TAB-7304-16G3GS */
    val TAB_7304_16G3GS = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Premier TAB-7769-32G4GS */
    val TAB_7769_32G4GS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Premier TAB-7887-32G3GB */
    val TAB_7887_32G3GB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Premier TAB-7888-32G3GB */
    val TAB_7888_32G3GB = "spec:width=800,height=1280,unit=px,dpi=213"

}
