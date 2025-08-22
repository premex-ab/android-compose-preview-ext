package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sohostyle device specifications for Android Compose previews.
 *
 * This extension provides Sohostyle device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sohostyle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sohostyle get() = object {
    /** Sohostyle S1582C */
    val S1582C = "spec:width=480,height=960,unit=px,dpi=213"

    /** Sohostyle S1586K */
    val S1586K = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sohostyle S65 */
    val S65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sohostyle S6561 */
    val S6561 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Sohostyle SS5314G */
    val SS5314G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Sohostyle SS5424G */
    val SS5424G = "spec:width=480,height=960,unit=px,dpi=220"

    /** Sohostyle SS5514G */
    val SS5514G = "spec:width=480,height=960,unit=px,dpi=213"

    /** Sohostyle SS5539G */
    val SS5539G = "spec:width=480,height=960,unit=px,dpi=240"

}
