package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Epikone device specifications for Android Compose previews.
 *
 * This extension provides Epikone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Epikone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Epikone get() = object {
    /** Epikone K406 */
    val K406 = "spec:width=360,height=640,unit=px,dpi=160"

    /** Epikone K501 */
    val K501 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Epikone K501_Plus */
    val K501_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Epikone k503 */
    val K503 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Epikone K503HD */
    val K503HD = "spec:width=720,height=1280,unit=px,dpi=300"

    /** Epikone K503S */
    val K503S = "spec:width=480,height=854,unit=px,dpi=213"

    /** Epikone K503T */
    val K503T = "spec:width=480,height=854,unit=px,dpi=240"

    /** Epikone K504 */
    val K504 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Epikone K506 */
    val K506 = "spec:width=480,height=854,unit=px,dpi=220"

    /** Epikone K511 */
    val K511 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Epikone K536 */
    val K536 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Epikone K545 */
    val K545 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Epikone K546 */
    val K546 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Epikone K601 */
    val K601 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Epikone K604 */
    val K604 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Epikone K605 */
    val K605 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Epikone TX1000 */
    val TX1000 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Epikone TX800 */
    val TX800 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Epikone X410 */
    val X410 = "spec:width=360,height=640,unit=px,dpi=160"

    /** Epikone X430 */
    val X430 = "spec:width=360,height=640,unit=px,dpi=165"

    /** Epikone X515 */
    val X515 = "spec:width=720,height=1280,unit=px,dpi=300"

    /** Epikone X516 */
    val X516 = "spec:width=720,height=1280,unit=px,dpi=300"

    /** Epikone X547 */
    val X547 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Epikone X572 */
    val X572 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Epikone X610 */
    val X610 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Epikone X618 */
    val X618 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Epikone X620 */
    val X620 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Epikone X650_tigo */
    val X650_TIGO = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Epikone X655 */
    val X655 = "spec:width=720,height=1600,unit=px,dpi=300"

}
