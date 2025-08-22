package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xmobile device specifications for Android Compose previews.
 *
 * This extension provides Xmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xmobile get() = object {
    /** Xmobile X1 */
    val X1 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Xmobile X10 */
    val X10 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Xmobile X10Max */
    val X10MAX = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Xmobile X55 */
    val X55 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Xmobile X_55B */
    val X_55B = "spec:width=480,height=960,unit=px,dpi=213"

    /** Xmobile X55USA */
    val X55USA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Xmobile X63Pro */
    val X63PRO = "spec:width=720,height=1520,unit=px,dpi=280"

    /** Xmobile X7 */
    val X7 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Xmobile X8Max */
    val X8MAX = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xmobile X8Pro */
    val X8PRO = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Xmobile X8Pro */
    val X8PRO_800X1280 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Xmobile X-mobile SmartWiFi */
    val X_MOBILE_SMARTWIFI = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Xmobile Xmovi_X8 */
    val XMOVI_X8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
