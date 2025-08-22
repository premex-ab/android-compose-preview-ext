package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fplus device specifications for Android Compose previews.
 *
 * This extension provides Fplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fplus get() = object {
    /** Fplus H166 */
    val H166 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Fplus Life Tab Plus */
    val LIFE_TAB_PLUS = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Fplus P670 */
    val P670 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Fplus R570E */
    val R570E = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Fplus SA50_21620 */
    val SA50_21620 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Fplus SA55_21624  */
    val SA55_21624 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Fplus SA70 */
    val SA70 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Fplus SH60_23230 */
    val SH60_23230 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Fplus SH65_23248 */
    val SH65_23248 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Fplus SP65_66440 */
    val SP65_66440 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Fplus T1100 */
    val T1100 = "spec:width=1600,height=2176,unit=px,dpi=320"

}
