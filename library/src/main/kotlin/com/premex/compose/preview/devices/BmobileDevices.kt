package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bmobile device specifications for Android Compose previews.
 *
 * This extension provides Bmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bmobile get() = object {
    /** Bmobile AX1016 */
    val AX1016 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile AX1017 */
    val AX1017 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile AX1035 */
    val AX1035 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1065E */
    val AX1065E = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1070E */
    val AX1070E = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1073 */
    val AX1073 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1074 */
    val AX1074 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1075 */
    val AX1075 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bmobile AX1076+ */
    val AX1076 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1077 */
    val AX1077 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1078 */
    val AX1078 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1078_OM */
    val AX1078_OM = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1078_TG06 */
    val AX1078_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX1082 */
    val AX1082 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile AX680+ */
    val AX680 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile AX681 */
    val AX681 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile AX683 */
    val AX683 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile AX685 */
    val AX685 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile AX687 */
    val AX687 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile AX688 */
    val AX688 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile AX715 */
    val AX715 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX754 */
    val AX754 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX754PLUS */
    val AX754PLUS = "spec:width=540,height=960,unit=px,dpi=260"

    /** Bmobile AX820 */
    val AX820 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX821 */
    val AX821 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX823 */
    val AX823 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX824 */
    val AX824 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX824A */
    val AX824A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX824Plus */
    val AX824PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX825 */
    val AX825 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile AX830 */
    val AX830 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile AX905 */
    val AX905 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile AX920 */
    val AX920 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bmobile AX921 */
    val AX921 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bmobile AX951 */
    val AX951 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile AX960 */
    val AX960 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile B50  */
    val B50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile B50_1 */
    val B50_1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile B50 PRO */
    val B50_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile B50ProSS_MV03 */
    val B50PROSS_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile B55 */
    val B55 = "spec:width=442,height=960,unit=px,dpi=213"

    /** Bmobile B60Pro */
    val B60PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bmobile B60Pro_MV03 */
    val B60PRO_MV03 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bmobile B70pro */
    val B70PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Bmobile BL40 */
    val BL40 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bmobile BL50 */
    val BL50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile BL50 Pro */
    val BL50_PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile BL51 */
    val BL51 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile BL52 */
    val BL52 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile BL52Pro */
    val BL52PRO = "spec:width=480,height=960,unit=px,dpi=200"

    /** Bmobile BL53 */
    val BL53 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile BL54Pro */
    val BL54PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile BL54_PRO_TG05 */
    val BL54_PRO_TG05 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile BL55 */
    val BL55 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile BL55_TG06 */
    val BL55_TG06 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Bmobile BL60M_MV05 */
    val BL60M_MV05 = "spec:width=600,height=1280,unit=px,dpi=280"

    /** Bmobile BL60_TG05 */
    val BL60_TG05 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bmobile BL60_TG17 */
    val BL60_TG17 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bmobile BL61 */
    val BL61 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bmobile BL62 */
    val BL62 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Bmobile BL62 */
    val BL62_720X1560 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bmobile BL63 */
    val BL63 = "spec:width=480,height=1016,unit=px,dpi=200"

    /** Bmobile BL63Pro */
    val BL63PRO = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Bmobile BL65 */
    val BL65 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Bmobile BL65 */
    val BL65_720X1600 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Bmobile BL65Plus_TG07 */
    val BL65PLUS_TG07 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Bmobile BM65 Pro */
    val BM65_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Bmobile Bmobile AX1082 */
    val BMOBILE_AX1082 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile Bmobile AX751 */
    val BMOBILE_AX751 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile Bmobile_AX751_PLUS */
    val BMOBILE_AX751_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bmobile Bmobile AX960 */
    val BMOBILE_AX960 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bmobile Bmobile_B60Pro */
    val BMOBILE_B60PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Bmobile Bmobile_BM65Plus */
    val BMOBILE_BM65PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Bmobile Cosmo B6 */
    val COSMO_B6 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Bmobile NOVUS65 */
    val NOVUS65 = "spec:width=576,height=1280,unit=px,dpi=260"

    /** Bmobile T70 */
    val T70 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Bmobile Ultra  */
    val ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Bmobile ULTRA S */
    val ULTRA_S = "spec:width=720,height=1612,unit=px,dpi=320"

}
