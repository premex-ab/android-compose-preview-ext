package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aiwa device specifications for Android Compose previews.
 *
 * This extension provides Aiwa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aiwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aiwa get() = object {
    /** Aiwa A81 */
    val A81 = "spec:width=800,height=1280,unit=px,dpi=300"

    /** Aiwa AW790 */
    val AW790 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Aiwa AWM501 */
    val AWM501 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Aiwa AWM539 */
    val AWM539 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Aiwa AW-P */
    val AW_P = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aiwa AWPP101AW */
    val AWPP101AW = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aiwa AWT10H */
    val AWT10H = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aiwa AW_TAB10_14 */
    val AW_TAB10_14 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aiwa JA2-SMP0601 */
    val JA2_SMP0601 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Aiwa JA2-TBA0801 */
    val JA2_TBA0801 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Aiwa JA2-TBA1001 */
    val JA2_TBA1001 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Aiwa JA2-TBA1002 */
    val JA2_TBA1002 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aiwa JA3-SMP0602 */
    val JA3_SMP0602 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Aiwa JA3-TBA0802 */
    val JA3_TBA0802 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aiwa JA3-TBA1005 */
    val JA3_TBA1005 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aiwa JA3-TBA1006-4 */
    val JA3_TBA1006_4 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Aiwa JA3-TBA1006-6 */
    val JA3_TBA1006_6 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Aiwa JA3-TBA1007 */
    val JA3_TBA1007 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Aiwa JA4-TBA1008 */
    val JA4_TBA1008 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Aiwa JA4-TBA1101 */
    val JA4_TBA1101 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Aiwa TA-07-232 */
    val TA_07_232 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Aiwa TA07-2GB */
    val TA07_2GB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Aiwa TA-10-232 */
    val TA_10_232 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aiwa TA10-SO10 */
    val TA10_SO10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aiwa TAB_1003G */
    val TAB_1003G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aiwa TAB-1100 */
    val TAB_1100 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Aiwa TAB-1102 */
    val TAB_1102 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Aiwa TAB-1103 */
    val TAB_1103 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Aiwa TABLETAWTH801 */
    val TABLETAWTH801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aiwa Z9 PLUS */
    val Z9_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

}
