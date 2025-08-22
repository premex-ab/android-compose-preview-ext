package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pcdargentina device specifications for Android Compose previews.
 *
 * This extension provides Pcdargentina device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pcdargentina.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pcdargentina get() = object {
    /** Pcdargentina P40 */
    val P40 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pcdargentina P41 */
    val P41 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pcdargentina P50 */
    val P50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Pcdargentina P55 */
    val P55 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Pcdargentina P60_CA */
    val P60_CA = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Pcdargentina P60 CENAM */
    val P60_CENAM = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Pcdargentina P63L */
    val P63L = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Pcdargentina P65 */
    val P65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Pcdargentina PD60 */
    val PD60 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Pcdargentina PH4003 */
    val PH4003 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pcdargentina PH4003 GO */
    val PH4003_GO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Pcdargentina PH5003 */
    val PH5003 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Pcdargentina PH5003 Go */
    val PH5003_GO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Pcdargentina PL550 */
    val PL550 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Pcdargentina PL571 */
    val PL571 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Pcdargentina PL571US */
    val PL571US = "spec:width=720,height=1440,unit=px,dpi=320"

}
