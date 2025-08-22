package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Blu device specifications for Android Compose previews.
 *
 * This extension provides Blu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Blu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Blu get() = object {
    /** Blu A30 */
    val A30 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu A5L */
    val A5L = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu ADVANCE 4.0 L2 */
    val ADVANCE_4_0_L2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu ADVANCE 4.0 L3 */
    val ADVANCE_4_0_L3 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu ADVANCE 5.0 HD */
    val ADVANCE_5_0_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Advance 5.2 */
    val ADVANCE_5_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Advance 5.2 */
    val ADVANCE_5_2_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Advance L4 */
    val ADVANCE_L4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu Advance L5 */
    val ADVANCE_L5 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu B110DL */
    val B110DL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu B131DL */
    val B131DL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu B140DL */
    val B140DL = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Blu B160V */
    val B160V = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Blu B3 */
    val B3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu BLU */
    val BLU = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu BLU Dash XL */
    val BLU_DASH_XL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu BLU Grand M3 */
    val BLU_GRAND_M3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu BLU S1 */
    val BLU_S1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu BLU_STUDIO_G2 */
    val BLU_STUDIO_G2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu BLU STUDIO J8 LTE */
    val BLU_STUDIO_J8_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu BLU VIEW 1 */
    val BLU_VIEW_1 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Blu BLU Vivo ONE */
    val BLU_VIVO_ONE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu BLU_Vivo_XL2 */
    val BLU_VIVO_XL2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu BOLD K10 */
    val BOLD_K10 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Blu BOLD K50 */
    val BOLD_K50 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Blu BOLD M7 */
    val BOLD_M7 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu BOLD N1 */
    val BOLD_N1 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Blu BOLD N2 */
    val BOLD_N2 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Blu BOLD N3 */
    val BOLD_N3 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Blu C2 */
    val C2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu C4 */
    val C4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu C5 */
    val C5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu C5 2019 */
    val C5_2019 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu C5 2019 */
    val C5_2019_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu C5L */
    val C5L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu C5L_2020 */
    val C5L_2020 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu C5L 2021 */
    val C5L_2021 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu C5L Max */
    val C5L_MAX = "spec:width=480,height=960,unit=px,dpi=200"

    /** Blu C5L Max */
    val C5L_MAX_480X960 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Blu C5L Max */
    val C5L_MAX_DPI240 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu C5L PLUS */
    val C5L_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

    /** Blu C5L_Plus */
    val C5L_PLUS_720X1440 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu C5 LTE */
    val C5_LTE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu C5 MAX */
    val C5_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu C5 PLUS */
    val C5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu C5X */
    val C5X = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu C6 */
    val C6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu  C6 2019  */
    val C6_2019 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu C6  2020 */
    val C6_2020 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu C6L */
    val C6L = "spec:width=540,height=960,unit=px,dpi=200"

    /** Blu C6L */
    val C6L_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu C6L 2020 */
    val C6L_2020 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu C6L 2021 */
    val C6L_2021 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Blu C6L 2021 */
    val C6L_2021_480X960 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu C6L MAX */
    val C6L_MAX = "spec:width=480,height=960,unit=px,dpi=200"

    /** Blu C6L Mini */
    val C6L_MINI = "spec:width=480,height=960,unit=px,dpi=200"

    /** Blu C6x */
    val C6X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu C7 */
    val C7 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu C7 MAX */
    val C7_MAX = "spec:width=480,height=1014,unit=px,dpi=220"

    /** Blu C7x */
    val C7X = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu C9 */
    val C9 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Blu D10 */
    val D10 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu D600 */
    val D600 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu D701 */
    val D701 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu Dash G */
    val DASH_G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu DASH L2 */
    val DASH_L2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu Dash L5X */
    val DASH_L5X = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu DASH M2 */
    val DASH_M2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Dash X */
    val DASH_X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Dash X2 */
    val DASH_X2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu DASH X2 */
    val DASH_X2_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu DIAMOND M */
    val DIAMOND_M = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu E20 */
    val E20 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu ENERGY DIAMOND */
    val ENERGY_DIAMOND = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu ENERGY DIAMOND MINI */
    val ENERGY_DIAMOND_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu Energy X 2 */
    val ENERGY_X_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu ENERGY  XL */
    val ENERGY_XL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu ENERGY X PLUS 2 */
    val ENERGY_X_PLUS_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu F5 */
    val F5 = "spec:width=720,height=1612,unit=px,dpi=300"

    /** Blu F91 5G */
    val F91_5G = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Blu G0290WW */
    val G0290WW = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G33 */
    val G33 = "spec:width=480,height=1014,unit=px,dpi=220"

    /** Blu G34 */
    val G34 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Blu G35 */
    val G35 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G40 */
    val G40 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu G43 */
    val G43 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Blu G44 */
    val G44 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Blu G5 */
    val G5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu G50 */
    val G50 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu G50 MEGA */
    val G50_MEGA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G50 MEGA 2022 */
    val G50_MEGA_2022 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu G50 Plus */
    val G50_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Blu G51 */
    val G51 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Blu G51 Plus */
    val G51_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G51S */
    val G51S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Blu G52L */
    val G52L = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G53 */
    val G53 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G54  */
    val G54 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G54 */
    val G54_720X1612 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Blu G5 Plus */
    val G5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu G6 */
    val G6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu G60 */
    val G60 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Blu G61 */
    val G61 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G61S */
    val G61S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu G63 */
    val G63 = "spec:width=720,height=1640,unit=px,dpi=240"

    /** Blu G64  */
    val G64 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Blu G64L */
    val G64L = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G70 */
    val G70 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Blu G71 */
    val G71 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu  G71L  */
    val G71L = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G72 MAX */
    val G72_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G73 */
    val G73 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G73L */
    val G73L = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G74 */
    val G74 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Blu G8 */
    val G8 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Blu G84 */
    val G84 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Blu G9 */
    val G9 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Blu G90 */
    val G90 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G90 PRO */
    val G90_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Blu G91 */
    val G91 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu G91_Max */
    val G91_MAX = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Blu G91 Pro */
    val G91_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu G91S */
    val G91S = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Blu G93 */
    val G93 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Blu G9 PRO */
    val G9_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Blu GRAND 5.5 HD */
    val GRAND_5_5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Grand 5.5 HD II */
    val GRAND_5_5_HD_II = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Grand Energy */
    val GRAND_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Grand M */
    val GRAND_M = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Grand M2 */
    val GRAND_M2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Grand_M2_LTE */
    val GRAND_M2_LTE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Grand MAX */
    val GRAND_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Grand Mini */
    val GRAND_MINI = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Grand X */
    val GRAND_X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Grand XL */
    val GRAND_XL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Grand XL LTE */
    val GRAND_XL_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Grand X LTE */
    val GRAND_X_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu J10L */
    val J10L = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Blu J12 */
    val J12 = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Blu J6L */
    val J6L = "spec:width=480,height=960,unit=px,dpi=200"

    /** Blu J6S */
    val J6S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Blu J7 */
    val J7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu J8L */
    val J8L = "spec:width=480,height=960,unit=px,dpi=213"

    /** Blu J9L */
    val J9L = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu J9L */
    val J9L_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu K0010 */
    val K0010 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu K0150 */
    val K0150 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Blu K0170 */
    val K0170 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Blu Life Max */
    val LIFE_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu LIFE ONE X2 */
    val LIFE_ONE_X2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu LIFE ONE X2 MINI */
    val LIFE_ONE_X2_MINI = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu Life One X3 */
    val LIFE_ONE_X3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu LIFE XL */
    val LIFE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu M10L */
    val M10L = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Blu M10L PLUS */
    val M10L_PLUS = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Blu M10L PLUS */
    val M10L_PLUS_800X1280 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Blu M10L Pro */
    val M10L_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Blu M10L Pro  */
    val M10L_PRO_800X1280 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Blu M6 */
    val M6 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu M6 */
    val M6_720X1560 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Blu M6 2021 */
    val M6_2021 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Blu M7i */
    val M7I = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu M7L */
    val M7L = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Blu M8L */
    val M8L = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Blu M8L 2022 */
    val M8L_2022 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Blu M8L Plus */
    val M8L_PLUS = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Blu Pure View */
    val PURE_VIEW = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu PURE XL */
    val PURE_XL = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Blu PURE XR */
    val PURE_XR = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu R1 HD */
    val R1_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu R1 PLUS */
    val R1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu R2_3G */
    val R2_3G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu R2 LTE */
    val R2_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu R2 Plus */
    val R2_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu S5 */
    val S5 = "spec:width=720,height=1280,unit=px,dpi=360"

    /** Blu S91 */
    val S91 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu S91 Pro */
    val S91_PRO = "spec:width=1080,height=1920,unit=px,dpi=320"

    /** Blu S950P */
    val S950P = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio C HD */
    val STUDIO_C_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu STUDIO G */
    val STUDIO_G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Studio G2 HD */
    val STUDIO_G2_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio G3 */
    val STUDIO_G3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Studio G4 */
    val STUDIO_G4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu STUDIO G HD LTE */
    val STUDIO_G_HD_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio J1 */
    val STUDIO_J1 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu Studio J2 */
    val STUDIO_J2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Studio J5 */
    val STUDIO_J5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu Studio J8 */
    val STUDIO_J8 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio_J8M */
    val STUDIO_J8M = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio Mega */
    val STUDIO_MEGA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio Mega */
    val STUDIO_MEGA_720X1440 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu STUDIO M HD */
    val STUDIO_M_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio One */
    val STUDIO_ONE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio Pro */
    val STUDIO_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu STUDIO TOUCH */
    val STUDIO_TOUCH = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio View */
    val STUDIO_VIEW = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Blu Studio View */
    val STUDIO_VIEW_720X1440 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu Studio View XL */
    val STUDIO_VIEW_XL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu Studio X10 */
    val STUDIO_X10 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Studio X10+ */
    val STUDIO_X10_480X960 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu Studio X10 2022 */
    val STUDIO_X10_2022 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Studio X10L */
    val STUDIO_X10L = "spec:width=480,height=854,unit=px,dpi=200"

    /** Blu Studio X10L 2022 */
    val STUDIO_X10L_2022 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Studio X12 */
    val STUDIO_X12 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu Studio X5 */
    val STUDIO_X5 = "spec:width=480,height=854,unit=px,dpi=220"

    /** Blu Studio X5 Max */
    val STUDIO_X5_MAX = "spec:width=480,height=960,unit=px,dpi=220"

    /** Blu Studio X8 HD */
    val STUDIO_X8_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Studio_XL_2 */
    val STUDIO_XL_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu STUIDIO SELFIE 2 */
    val STUIDIO_SELFIE_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu SUTDIO ENERGY 2 */
    val SUTDIO_ENERGY_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu T5 */
    val T5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu T5 Plus */
    val T5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu T6 */
    val T6 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu T6L */
    val T6L = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blu Tank_Xtreme */
    val TANK_XTREME = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blu Tank Xtreme 5.0 */
    val TANK_XTREME_5_0 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Touchbook M7 Pro */
    val TOUCHBOOK_M7_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Blu View 5 Pro */
    val VIEW_5_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Blu VIVO 5 */
    val VIVO_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Vivo 5 Mini */
    val VIVO_5_MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blu VIVO 5R */
    val VIVO_5R = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu VIVO 6 */
    val VIVO_6 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu Vivo 8 */
    val VIVO_8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu Vivo_8_LL */
    val VIVO_8_LL = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blu Vivo_8L_UU */
    val VIVO_8L_UU = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu VIVO GO */
    val VIVO_GO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu Vivo_One_Plus */
    val VIVO_ONE_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Vivo One Plus 2019 */
    val VIVO_ONE_PLUS_2019 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Blu Vivo S */
    val VIVO_S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu VIVO VI+ */
    val VIVO_VI = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Blu VIVO XI */
    val VIVO_XI = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Blu VIVO XL */
    val VIVO_XL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blu Vivo XL3 */
    val VIVO_XL3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu Vivo XL3 Plus */
    val VIVO_XL3_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu Vivo XL4 */
    val VIVO_XL4 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Blu Vivo X WW */
    val VIVO_X_WW = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Blu X22 */
    val X22 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Blu X5 */
    val X5 = "spec:width=540,height=960,unit=px,dpi=200"

}
