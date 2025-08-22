package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nec device specifications for Android Compose previews.
 *
 * This extension provides Nec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nec get() = object {
    /** Nec AGT10 D000-000039-001 */
    val AGT10_D000_000039_001 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Nec Disney Mobile on docomoN-03E */
    val DISNEY_MOBILE_ON_DOCOMON_03E = "spec:width=720,height=1184,unit=px,dpi=320"

    /** Nec LAVIE T11 112K1 */
    val LAVIE_T11_112K1 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Nec LAVIE T11 11QHD1 */
    val LAVIE_T11_11QHD1 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Nec LAVIE T8 8HD1 */
    val LAVIE_T8_8HD1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nec LAVIE Tab 102K1 */
    val LAVIE_TAB_102K1 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Nec LAVIE Tab E */
    val LAVIE_TAB_E = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Nec LAVIE Tab E */
    val LAVIE_TAB_E_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nec LAVIE Tab E 10FHD1 */
    val LAVIE_TAB_E_10FHD1 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Nec LAVIE Tab E 10FHD2 */
    val LAVIE_TAB_E_10FHD2 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Nec LAVIE Tab E 7SD1 */
    val LAVIE_TAB_E_7SD1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Nec LAVIE Tab E 8FHD1 */
    val LAVIE_TAB_E_8FHD1 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Nec LAVIE Tab E 8HD1 */
    val LAVIE_TAB_E_8HD1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nec LaVieTab PC-TE508BAW */
    val LAVIETAB_PC_TE508BAW = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nec LaVieTab PC-TE508S1W/LaVieTab PC-TE508S1L */
    val LAVIETAB_PC_TE508S1W_LAVIETAB_PC_TE508S1L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nec LaVieTab PC-TE510S1L */
    val LAVIETAB_PC_TE510S1L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Nec LAVIE Tab T10 */
    val LAVIE_TAB_T10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Nec LAVIE Tab T11 */
    val LAVIE_TAB_T11 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Nec LAVIE Tab T11 */
    val LAVIE_TAB_T11_1200X2000 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Nec LAVIE Tab T11  */
    val LAVIE_TAB_T11_DPI320 = "spec:width=1536,height=2560,unit=px,dpi=320"

    /** Nec LAVIETab T12 12QHD1 */
    val LAVIETAB_T12_12QHD1 = "spec:width=1600,height=2560,unit=px,dpi=240"

    /** Nec LAVIE Tab T14 */
    val LAVIE_TAB_T14 = "spec:width=1876,height=3000,unit=px,dpi=320"

    /** Nec LAVIE Tab T9 */
    val LAVIE_TAB_T9 = "spec:width=1600,height=2560,unit=px,dpi=400"

    /** Nec MEDIAS U N-02E */
    val MEDIAS_U_N_02E = "spec:width=480,height=800,unit=px,dpi=240"

    /** Nec MEDIAS X N-04E */
    val MEDIAS_X_N_04E = "spec:width=720,height=1184,unit=px,dpi=320"

    /** Nec MEDIAS  X N-06E */
    val MEDIAS_X_N_06E = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nec MEDIAS X N-07D */
    val MEDIAS_X_N_07D = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nec NEC PC-TE510BAL */
    val NEC_PC_TE510BAL = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Nec PC-508T1W */
    val PC_508T1W = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Nec PC-708T1W */
    val PC_708T1W = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Nec PC-TE307N1W */
    val PC_TE307N1W = "spec:width=600,height=976,unit=px,dpi=160"

    /** Nec PC-TE510JAW */
    val PC_TE510JAW = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Nec PC-TE510N1B */
    val PC_TE510N1B = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Nec PC- TS507N1S */
    val PC_TS507N1S = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nec Tab M7 3rd Gen */
    val TAB_M7_3RD_GEN = "spec:width=600,height=1024,unit=px,dpi=160"

}
