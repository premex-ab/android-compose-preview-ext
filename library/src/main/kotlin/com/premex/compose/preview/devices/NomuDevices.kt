package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nomu device specifications for Android Compose previews.
 *
 * This extension provides Nomu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nomu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nomu get() = object {
    /** Nomu G200 */
    val G200 = "spec:width=720,height=1600,unit=px,dpi=240"

    /** Nomu M8 */
    val M8 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomu S10 */
    val S10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomu S50 Pro */
    val S50_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nomu T20E */
    val T20E = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomu V31 */
    val V31 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nomu V31D */
    val V31D = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nomu V31E */
    val V31E = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Nomu V58 */
    val V58 = "spec:width=720,height=1520,unit=px,dpi=320"

}
