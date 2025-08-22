package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kenxinda device specifications for Android Compose previews.
 *
 * This extension provides Kenxinda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kenxinda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kenxinda get() = object {
    /** Kenxinda 6Cb */
    val _6CB = "spec:width=480,height=960,unit=px,dpi=213"

    /** Kenxinda A1 */
    val A1 = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Kenxinda A8 */
    val A8 = "spec:width=480,height=1014,unit=px,dpi=240"

    /** Kenxinda D26 */
    val D26 = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Kenxinda D70 */
    val D70 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Kenxinda K30M */
    val K30M = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Kenxinda Nitro_55R */
    val NITRO_55R = "spec:width=480,height=960,unit=px,dpi=240"

    /** Kenxinda T50 */
    val T50 = "spec:width=240,height=296,unit=px,dpi=120"

    /** Kenxinda T50Y */
    val T50Y = "spec:width=320,height=385,unit=px,dpi=160"

    /** Kenxinda T55 */
    val T55 = "spec:width=320,height=385,unit=px,dpi=160"

    /** Kenxinda T55S */
    val T55S = "spec:width=320,height=385,unit=px,dpi=160"

    /** Kenxinda W55Y */
    val W55Y = "spec:width=240,height=296,unit=px,dpi=120"

    /** Kenxinda X10 */
    val X10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kenxinda X7g */
    val X7G = "spec:width=600,height=1024,unit=px,dpi=240"

    /** Kenxinda X7s */
    val X7S = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Kenxinda Y10 */
    val Y10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kenxinda Y20 */
    val Y20 = "spec:width=720,height=1520,unit=px,dpi=320"

}
