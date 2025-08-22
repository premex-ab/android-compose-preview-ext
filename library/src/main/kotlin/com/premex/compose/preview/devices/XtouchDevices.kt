package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xtouch device specifications for Android Compose previews.
 *
 * This extension provides Xtouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xtouch get() = object {
    /** Xtouch A4 */
    val A4 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Xtouch A5 */
    val A5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Xtouch  S20 */
    val S20 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Xtouch S40 */
    val S40 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Xtouch X40 */
    val X40 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Xtouch XBot Junior */
    val XBOT_JUNIOR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Xtouch XBOT_SENIOR */
    val XBOT_SENIOR = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Xtouch XP10_4G */
    val XP10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xtouch XP10_Wifi */
    val XP10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xtouch XTOUCH X */
    val XTOUCH_X = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Xtouch XTOUCH X10 */
    val XTOUCH_X10 = "spec:width=720,height=1440,unit=px,dpi=320"

}
