package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Raddy device specifications for Android Compose previews.
 *
 * This extension provides Raddy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Raddy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Raddy get() = object {
    /** Raddy RADDY_JANJA */
    val RADDY_JANJA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Raddy RADDY_JANJA_PRO */
    val RADDY_JANJA_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

}
