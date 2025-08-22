package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BLU device specifications for Android Compose previews.
 *
 * This extension provides BLU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blu: Any
  get() = object {
      /** BLU A0050LL */
      val A0050LL = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU A230Q */
      val A230Q = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU A290Q */
      val A290Q = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU A30 */
      val A30 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU A350 */
      val A350 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU A350A */
      val A350A = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU A390 */
      val A390 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU A390T */
      val A390T = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU Advance_4_0_L3 */
      val ADVANCE_4_0_L3 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU Advance_5_0_HD */
      val ADVANCE_5_0_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU B100DL */
      val B100DL = "spec:width=480,height=960,unit=px,dpi=213"

      /** BLU B110DL */
      val B110DL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU B130DL */
      val B130DL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU B140DL */
      val B140DL = "spec:width=720,height=1440,unit=px,dpi=280"

      /** BLU B160V */
      val B160V = "spec:width=720,height=1612,unit=px,dpi=280"

      /** BLU B170D */
      val B170D = "spec:width=720,height=1600,unit=px,dpi=280"

      /** BLU B301 */
      val B301 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU BLU_ADVANCE_4_0_L2 */
      val BLU_ADVANCE_4_0_L2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU BLU_DASH_L2 */
      val BLU_DASH_L2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU BLU_DASH_M2 */
      val BLU_DASH_M2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU BLU_DASH_X */
      val BLU_DASH_X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_DASH_X2 */
      val BLU_DASH_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_DIAMOND_M */
      val BLU_DIAMOND_M = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU BLU_ENERGY_DIAMOND */
      val BLU_ENERGY_DIAMOND = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU BLU_ENERGY_XL */
      val BLU_ENERGY_XL = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU BLU_Energy_X_2 */
      val BLU_ENERGY_X_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_ENERGY_X_PLUS_2 */
      val BLU_ENERGY_X_PLUS_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_GRAND_5_5_HD */
      val BLU_GRAND_5_5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_Grand_X_LTE */
      val BLU_GRAND_X_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_LIFE_XL */
      val BLU_LIFE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_PURE_XL */
      val BLU_PURE_XL = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** BLU BLU_Pure_XR */
      val BLU_PURE_XR = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU BLU_R1_HD */
      val BLU_R1_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_STUDIO_C_HD */
      val BLU_STUDIO_C_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_STUDIO_ENERGY_2 */
      val BLU_STUDIO_ENERGY_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_STUDIO_G */
      val BLU_STUDIO_G = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU BLU_STUDIO_G2 */
      val BLU_STUDIO_G2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU BLU_STUDIO_M_HD */
      val BLU_STUDIO_M_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_STUDIO_ONE */
      val BLU_STUDIO_ONE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_STUDIO_SELFIE_2 */
      val BLU_STUDIO_SELFIE_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU BLU_Studio_Touch */
      val BLU_STUDIO_TOUCH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_VIVO_5 */
      val BLU_VIVO_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_Vivo_5R */
      val BLU_VIVO_5R = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU BLU_Vivo_6 */
      val BLU_VIVO_6 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU BLU_VIVO_XL */
      val BLU_VIVO_XL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU BLU_Vivo_XL2 */
      val BLU_VIVO_XL2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU C0010LL */
      val C0010LL = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0010TT */
      val C0010TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0010UU */
      val C0010UU = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0030 */
      val C0030 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU C0040TT */
      val C0040TT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU C0050 */
      val C0050 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0051LL */
      val C0051LL = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0070WW */
      val C0070WW = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0090WW */
      val C0090WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU C0100TT */
      val C0100TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0101TT */
      val C0101TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0101WW */
      val C0101WW = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C010Q */
      val C010Q = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0130UU */
      val C0130UU = "spec:width=480,height=960,unit=px,dpi=200"

      /** BLU C014 */
      val C014 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0140TT */
      val C0140TT = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU C0141TT */
      val C0141TT = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU C0150WW */
      val C0150WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU C0151WW */
      val C0151WW = "spec:width=480,height=960,unit=px,dpi=220"

      /** BLU C0161WW */
      val C0161WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU C0162WW */
      val C0162WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU C0170WW */
      val C0170WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU C0173WW */
      val C0173WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU C0175 */
      val C0175 = "spec:width=480,height=960,unit=px,dpi=220"

      /** BLU C0176 */
      val C0176 = "spec:width=480,height=960,unit=px,dpi=200"

      /** BLU C017U */
      val C017U = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C0190 */
      val C0190 = "spec:width=540,height=960,unit=px,dpi=200"

      /** BLU C0200 */
      val C0200 = "spec:width=480,height=960,unit=px,dpi=200"

      /** BLU C0210 */
      val C0210 = "spec:width=480,height=960,unit=px,dpi=200"

      /** BLU C0220 */
      val C0220 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** BLU C0230 */
      val C0230 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** BLU C0270 */
      val C0270 = "spec:width=480,height=960,unit=px,dpi=200"

      /** BLU C031P */
      val C031P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU C050 */
      val C050 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU C090EQ */
      val C090EQ = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU C090P */
      val C090P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU C110 */
      val C110 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU C111 */
      val C111 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU C130EQ */
      val C130EQ = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU C210 */
      val C210 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU C230EQ */
      val C230EQ = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU C250EQ */
      val C250EQ = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU C270EQ */
      val C270EQ = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU C290EQ */
      val C290EQ = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU D0070WW */
      val D0070WW = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU D10 */
      val D10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU D600 */
      val D600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU D701 */
      val D701 = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU Dash_G */
      val DASH_G = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU Dash_X2 */
      val DASH_X2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU Dash_XL */
      val DASH_XL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU E0010 */
      val E0010 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** BLU E20 */
      val E20 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU ENERGY_DIAMOND_MINI */
      val ENERGY_DIAMOND_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU F0030UU */
      val F0030UU = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** BLU F0090 */
      val F0090 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** BLU G0030 */
      val G0030 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU G0050 */
      val G0050 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU G0070WW */
      val G0070WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU G0090 */
      val G0090 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU G0130WW */
      val G0130WW = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BLU G0130WW_SR */
      val G0130WW_SR = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BLU G0151WW */
      val G0151WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU G0170 */
      val G0170 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BLU G0190 */
      val G0190 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU G0210 */
      val G0210 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU G0230WW */
      val G0230WW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** BLU G0231WW */
      val G0231WW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** BLU G0250WW */
      val G0250WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU G0251WW */
      val G0251WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU G0270WW */
      val G0270WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU G0290WW */
      val G0290WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0310WW */
      val G0310WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0330WW */
      val G0330WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU G0350WW */
      val G0350WW = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BLU G0370WW */
      val G0370WW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** BLU G0390WW */
      val G0390WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0410WW */
      val G0410WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0430WW */
      val G0430WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0450WW */
      val G0450WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0490WW */
      val G0490WW = "spec:width=720,height=1560,unit=px,dpi=300"

      /** BLU G0510WW */
      val G0510WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0512WW */
      val G0512WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0530WW */
      val G0530WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU G0550WW */
      val G0550WW = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** BLU G0570WW */
      val G0570WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0581WW */
      val G0581WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU G0590WW */
      val G0590WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU G0591WW */
      val G0591WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU G0630WW */
      val G0630WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU G0670WW */
      val G0670WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU G0690WW */
      val G0690WW = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** BLU G0710WW */
      val G0710WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0730WW */
      val G0730WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU G0770 */
      val G0770 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0771 */
      val G0771 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0790UU */
      val G0790UU = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU G0820WW */
      val G0820WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0830WW */
      val G0830WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0840 */
      val G0840 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0850 */
      val G0850 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0850_IW */
      val G0850_IW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0850_TIGO */
      val G0850_TIGO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0851 */
      val G0851 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0860 */
      val G0860 = "spec:width=720,height=1640,unit=px,dpi=240"

      /** BLU G0870 */
      val G0870 = "spec:width=720,height=1640,unit=px,dpi=240"

      /** BLU G0890 */
      val G0890 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** BLU G0892 */
      val G0892 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** BLU G0894 */
      val G0894 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** BLU G0910 */
      val G0910 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** BLU G0930 */
      val G0930 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G0950 */
      val G0950 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** BLU G0970 */
      val G0970 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** BLU G0971 */
      val G0971 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** BLU G0990 */
      val G0990 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G1010 */
      val G1010 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** BLU G1030 */
      val G1030 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** BLU G1050 */
      val G1050 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** BLU G1070 */
      val G1070 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** BLU G1110 */
      val G1110 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU G170Q */
      val G170Q = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU G190 */
      val G190 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU G210Q */
      val G210Q = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Grand_Energy */
      val GRAND_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Grand_M */
      val GRAND_M = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU Grand_Max */
      val GRAND_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Grand_X */
      val GRAND_X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Grand_XL */
      val GRAND_XL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU J0000LL_ATT_MX */
      val J0000LL_ATT_MX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU J0080WW */
      val J0080WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU J0082WW */
      val J0082WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU J0090WW */
      val J0090WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU J0092WW */
      val J0092WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU J0100 */
      val J0100 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** BLU J0110 */
      val J0110 = "spec:width=480,height=960,unit=px,dpi=200"

      /** BLU J0140 */
      val J0140 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** BLU J0150 */
      val J0150 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** BLU J0170 */
      val J0170 = "spec:width=480,height=960,unit=px,dpi=213"

      /** BLU J0230 */
      val J0230 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** BLU J210EQ */
      val J210EQ = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU K0010 */
      val K0010 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU K0110 */
      val K0110 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** BLU K0130 */
      val K0130 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** BLU K0150 */
      val K0150 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** BLU K0170 */
      val K0170 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** BLU K10 */
      val K10 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** BLU K101 */
      val K101 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BLU K10_PRO */
      val K10_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** BLU L0150WW */
      val L0150WW = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU Life_Max */
      val LIFE_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Life_One_X2 */
      val LIFE_ONE_X2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU Life_One_X2_Mini */
      val LIFE_ONE_X2_MINI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU M0030TT */
      val M0030TT = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU M0050LL */
      val M0050LL = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BLU M0080WW */
      val M0080WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BLU M0100WW */
      val M0100WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU M0160WW */
      val M0160WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU M0170WW */
      val M0170WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0171WW */
      val M0171WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0172WW */
      val M0172WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0173WW */
      val M0173WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0174WW */
      val M0174WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0174WW_ND */
      val M0174WW_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0176 */
      val M0176 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0176_EX */
      val M0176_EX = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0176_ND */
      val M0176_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0178_ND */
      val M0178_ND = "spec:width=800,height=1280,unit=px,dpi=200"

      /** BLU M0208WW */
      val M0208WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0209WW */
      val M0209WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0210WW */
      val M0210WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0212WW_ND */
      val M0212WW_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0213_ND */
      val M0213_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0214_ND */
      val M0214_ND = "spec:width=800,height=1280,unit=px,dpi=220"

      /** BLU M0215 */
      val M0215 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** BLU M0215_ND */
      val M0215_ND = "spec:width=800,height=1280,unit=px,dpi=200"

      /** BLU M0220WW */
      val M0220WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0220WW_ND */
      val M0220WW_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0222 */
      val M0222 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0222_EX */
      val M0222_EX = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0222_IMT */
      val M0222_IMT = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BLU M0223_ND */
      val M0223_ND = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BLU M0224 */
      val M0224 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** BLU M030P */
      val M030P = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU N0030WW */
      val N0030WW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** BLU N0050UU */
      val N0050UU = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** BLU N0070 */
      val N0070 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** BLU P0050WW */
      val P0050WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU P290 */
      val P290 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BLU R010P */
      val R010P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU R0150EE */
      val R0150EE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU R0170WW */
      val R0170WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU R0190WW */
      val R0190WW = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU R1_HD */
      val R1_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU R1_PLUS */
      val R1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU S011EQ */
      val S011EQ = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU S0320WW */
      val S0320WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU S0450WW */
      val S0450WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU S0480LL */
      val S0480LL = "spec:width=720,height=1280,unit=px,dpi=360"

      /** BLU S050EQ */
      val S050EQ = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU S0570WW */
      val S0570WW = "spec:width=480,height=854,unit=px,dpi=200"

      /** BLU S0590LL */
      val S0590LL = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU S0610WW */
      val S0610WW = "spec:width=480,height=854,unit=px,dpi=220"

      /** BLU S0630WW */
      val S0630WW = "spec:width=480,height=960,unit=px,dpi=220"

      /** BLU S0690WW */
      val S0690WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU S0730WW */
      val S0730WW = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLU S532 */
      val S532 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU S750 */
      val S750 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU S770P */
      val S770P = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU S790Q */
      val S790Q = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU S810 */
      val S810 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** BLU S812P */
      val S812P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU S870Q */
      val S870Q = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU S910Q */
      val S910Q = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU S950P */
      val S950P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU S970EQ */
      val S970EQ = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU S990EQ */
      val S990EQ = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU Studio_G2_HD */
      val STUDIO_G2_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Studio_G_HD_LTE */
      val STUDIO_G_HD_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Studio_J1 */
      val STUDIO_J1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU Studio_J2 */
      val STUDIO_J2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU Studio_J5 */
      val STUDIO_J5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU Studio_J8 */
      val STUDIO_J8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Studio_J8_LTE */
      val STUDIO_J8_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Studio_Mega */
      val STUDIO_MEGA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU Studio_XL_2 */
      val STUDIO_XL_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU T0030WW */
      val T0030WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLU T0040TT */
      val T0040TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU T0050TT */
      val T0050TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU T0060TT */
      val T0060TT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU T0070TT_TIGO */
      val T0070TT_TIGO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU T0080TT */
      val T0080TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU T0090TT */
      val T0090TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU T0120TT */
      val T0120TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU T0130TT */
      val T0130TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLU Tank_Xtreme_5_0 */
      val TANK_XTREME_5_0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU V0150LL */
      val V0150LL = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU V0150UU */
      val V0150UU = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BLU V0160WW */
      val V0160WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU V0190UU */
      val V0190UU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU V0210WW */
      val V0210WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU V0230WW */
      val V0230WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU V0250WW */
      val V0250WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU V0270WW */
      val V0270WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU V0290WW */
      val V0290WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BLU V0310WW */
      val V0310WW = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** BLU V0330WW */
      val V0330WW = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BLU V0350WW */
      val V0350WW = "spec:width=720,height=1500,unit=px,dpi=320"

      /** BLU V0370WW */
      val V0370WW = "spec:width=720,height=1500,unit=px,dpi=320"

      /** BLU V0390WW */
      val V0390WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLU Vivo_5_Mini */
      val VIVO_5_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLU X0010WW */
      val X0010WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** BLU X0020 */
      val X0020 = "spec:width=540,height=960,unit=px,dpi=200"

  }
