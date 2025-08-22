package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Orange device specifications for Android Compose previews.
 *
 * This extension provides Orange device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Orange.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Orange get() = object {
    /** Orange Dive 30 */
    val DIVE_30 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Orange Dive 50 */
    val DIVE_50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Orange Dive_70 */
    val DIVE_70 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Orange Dive 71 */
    val DIVE_71 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Orange Dive72 */
    val DIVE72 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Orange Luno */
    val LUNO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Orange Mahpee */
    val MAHPEE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Orange Neva 80 */
    val NEVA_80 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Orange Neva leaf */
    val NEVA_LEAF = "spec:width=480,height=960,unit=px,dpi=240"

    /** Orange Neva Rise S1 */
    val NEVA_RISE_S1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Orange Neva start */
    val NEVA_START = "spec:width=480,height=960,unit=px,dpi=240"

    /** Orange Nola fun */
    val NOLA_FUN = "spec:width=480,height=854,unit=px,dpi=200"

    /** Orange Nura */
    val NURA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Orange Nura2 */
    val NURA2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Orange Orange */
    val ORANGE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Orange Orange Neva play */
    val ORANGE_NEVA_PLAY = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Orange Orange Neva sparkle */
    val ORANGE_NEVA_SPARKLE = "spec:width=480,height=960,unit=px,dpi=200"

    /** Orange Orange Neva zen */
    val ORANGE_NEVA_ZEN = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Orange Orange Nola play */
    val ORANGE_NOLA_PLAY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Orange Orange Nola play plus */
    val ORANGE_NOLA_PLAY_PLUS = "spec:width=480,height=854,unit=px,dpi=200"

    /** Orange Orange Nola XL */
    val ORANGE_NOLA_XL = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Orange Orange Rise 33 */
    val ORANGE_RISE_33 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Orange Orange Rise 53 */
    val ORANGE_RISE_53 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Orange Rise 30 */
    val RISE_30 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Orange Rise31 */
    val RISE31 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Orange Rise32 */
    val RISE32 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Orange Rise51 */
    val RISE51 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Orange Rise52 */
    val RISE52 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Orange Rise_54 */
    val RISE_54 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Orange Roya */
    val ROYA = "spec:width=480,height=854,unit=px,dpi=240"

    /** Orange Sanza plus */
    val SANZA_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

    /** Orange Sanza_touch */
    val SANZA_TOUCH = "spec:width=480,height=800,unit=px,dpi=213"

    /** Orange Sego */
    val SEGO = "spec:width=800,height=1280,unit=px,dpi=213"

}
