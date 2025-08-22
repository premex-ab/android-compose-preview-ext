package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dixon device specifications for Android Compose previews.
 *
 * This extension provides Dixon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dixon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dixon get() = object {
    /** Dixon ACK1010 */
    val ACK1010 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Dixon DFM48 */
    val DFM48 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Dixon DN6015 */
    val DN6015 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dixon DN6023D */
    val DN6023D = "spec:width=480,height=960,unit=px,dpi=213"

    /** Dixon DN6901 */
    val DN6901 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Dixon KT5512 */
    val KT5512 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Dixon L1 */
    val L1 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Dixon L-5 */
    val L_5 = "spec:width=442,height=960,unit=px,dpi=240"

    /** Dixon S5790 */
    val S5790 = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Dixon S90 */
    val S90 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Dixon TS_M103A */
    val TS_M103A = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Dixon TS-M105D */
    val TS_M105D = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Dixon TS-M105D-MKII */
    val TS_M105D_MKII = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Dixon TS-M105G-1 */
    val TS_M105G_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dixon TS-M704F-1 */
    val TS_M704F_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dixon TS-M704G */
    val TS_M704G = "spec:width=800,height=1280,unit=px,dpi=238"

}
