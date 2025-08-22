package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ditecma device specifications for Android Compose previews.
 *
 * This extension provides Ditecma device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ditecma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ditecma get() = object {
    /** Ditecma Blade */
    val BLADE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ditecma M1092R */
    val M1092R = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ditecma M1092RV5 */
    val M1092RV5 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Ditecma XP */
    val XP = "spec:width=1080,height=2400,unit=px,dpi=480"

}
