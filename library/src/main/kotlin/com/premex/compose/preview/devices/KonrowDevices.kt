package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Konrow device specifications for Android Compose previews.
 *
 * This extension provides Konrow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Konrow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Konrow get() = object {
    /** Konrow CITY */
    val CITY = "spec:width=480,height=800,unit=px,dpi=240"

    /** Konrow CITY4_EEA */
    val CITY4_EEA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Konrow CITY5 */
    val CITY5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Konrow EASY_5 */
    val EASY_5 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Konrow EASY5 */
    val EASY5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Konrow EASY62 */
    val EASY62 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Konrow EASY_K55 */
    val EASY_K55 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Konrow EASY_S55P */
    val EASY_S55P = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Konrow EASY S55P 2021 */
    val EASY_S55P_2021 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Konrow KTAB_1003 */
    val KTAB_1003 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Konrow KTAB_1004 */
    val KTAB_1004 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Konrow K-TAB1005 */
    val K_TAB1005 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Konrow K-TAB703 */
    val K_TAB703 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Konrow KTAB704 */
    val KTAB704 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Konrow K-TAB801 */
    val K_TAB801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Konrow MUST */
    val MUST = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Konrow Sky */
    val SKY = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Konrow SKY_55 */
    val SKY_55 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Konrow SKY55 */
    val SKY55 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Konrow SKY63 */
    val SKY63 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Konrow SKY LITE */
    val SKY_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Konrow SKY PLUS */
    val SKY_PLUS = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Konrow SOFT5 */
    val SOFT5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Konrow SOFT5P */
    val SOFT5P = "spec:width=480,height=854,unit=px,dpi=240"

    /** Konrow SWEET5 */
    val SWEET5 = "spec:width=480,height=854,unit=px,dpi=240"

}
