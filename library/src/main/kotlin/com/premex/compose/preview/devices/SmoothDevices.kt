package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smooth device specifications for Android Compose previews.
 *
 * This extension provides Smooth device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smooth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smooth get() = object {
    /** Smooth Smooth5_5 */
    val SMOOTH5_5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Smooth Smooth_5_HD */
    val SMOOTH_5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Smooth Smooth626 */
    val SMOOTH626 = "spec:width=480,height=1014,unit=px,dpi=213"

}
