package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ktouch device specifications for Android Compose previews.
 *
 * This extension provides Ktouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ktouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ktouch get() = object {
    /** Ktouch Pace 2 Lite */
    val PACE_2_LITE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Ktouch S5 */
    val S5 = "spec:width=720,height=1600,unit=px,dpi=320"

}
