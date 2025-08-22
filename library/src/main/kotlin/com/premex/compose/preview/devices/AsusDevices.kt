package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * asus device specifications for Android Compose previews.
 *
 * This extension provides asus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Asus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Asus: Any
  get() = object {
      /** asus ASUSAI2501 */
      val ASUSAI2501 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** asus ASUS_A001 */
      val ASUS_A001 = "spec:width=1080,height=1920,unit=px,dpi=360"

      /** asus ASUS_A001D_1 */
      val ASUS_A001D_1 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** asus ASUS_A001D_2 */
      val ASUS_A001D_2 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** asus ASUS_A002 */
      val ASUS_A002 = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** asus ASUS_A002_1 */
      val ASUS_A002_1 = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** asus ASUS_A006 */
      val ASUS_A006 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** asus ASUS_A007 */
      val ASUS_A007 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_A009 */
      val ASUS_A009 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS-A86 */
      val ASUS_A86 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_AI2201 */
      val ASUS_AI2201 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** asus ASUS_AI2202 */
      val ASUS_AI2202 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** asus ASUS_AI2203 */
      val ASUS_AI2203 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** asus ASUS_AI2205 */
      val ASUS_AI2205 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** asus ASUS_AI2302 */
      val ASUS_AI2302 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** asus ASUS_AI2401 */
      val ASUS_AI2401 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** asus ASUS_I001_1 */
      val ASUS_I001_1 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** asus ASUS_I002D */
      val ASUS_I002D = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** asus ASUS_I003_1 */
      val ASUS_I003_1 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** asus ASUS_I004D */
      val ASUS_I004D = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** asus ASUS_I005_1 */
      val ASUS_I005_1 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** asus ASUS_I006D */
      val ASUS_I006D = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** asus ASUS_I007_1 */
      val ASUS_I007_1 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** asus ASUS_I01WD */
      val ASUS_I01WD = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** asus ASUS_L001_1 */
      val ASUS_L001_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus ASUS_L001_2 */
      val ASUS_L001_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus ASUS_P00I */
      val ASUS_P00I = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus ASUS_P00J */
      val ASUS_P00J = "spec:width=1536,height=2048,unit=px,dpi=360"

      /** asus ASUS_P00L_1 */
      val ASUS_P00L_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus ASUS_P00L_2 */
      val ASUS_P00L_2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** asus ASUS_P028_1 */
      val ASUS_P028_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus ASUS_P028_2 */
      val ASUS_P028_2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** asus ASUS-T00D */
      val ASUS_T00D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_T00F */
      val ASUS_T00F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_T00F1 */
      val ASUS_T00F1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_T00G */
      val ASUS_T00G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_T00I */
      val ASUS_T00I = "spec:width=480,height=800,unit=px,dpi=240"

      /** asus ASUS_T00J */
      val ASUS_T00J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_T00J1 */
      val ASUS_T00J1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_T00K */
      val ASUS_T00K = "spec:width=540,height=960,unit=px,dpi=240"

      /** asus ASUS_T00N */
      val ASUS_T00N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_T00P */
      val ASUS_T00P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_T00Q */
      val ASUS_T00Q = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_X005 */
      val ASUS_X005 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_X007D */
      val ASUS_X007D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X008 */
      val ASUS_X008 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X008_1 */
      val ASUS_X008_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X009D_2 */
      val ASUS_X009D_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** asus ASUS_X00AD_2 */
      val ASUS_X00AD_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00BD_1 */
      val ASUS_X00BD_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** asus ASUS_X00DD */
      val ASUS_X00DD = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_X00G_1 */
      val ASUS_X00G_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00HD_1 */
      val ASUS_X00HD_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00HD_2 */
      val ASUS_X00HD_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00HD_3 */
      val ASUS_X00HD_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00HD_4 */
      val ASUS_X00HD_4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00ID */
      val ASUS_X00ID = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00IDB */
      val ASUS_X00IDB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00IDC */
      val ASUS_X00IDC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00LD_1 */
      val ASUS_X00LD_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00LD_2 */
      val ASUS_X00LD_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00LD_3 */
      val ASUS_X00LD_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X00P_1 */
      val ASUS_X00P_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00P_2 */
      val ASUS_X00P_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00P_3 */
      val ASUS_X00P_3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00P_4 */
      val ASUS_X00P_4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00P_6 */
      val ASUS_X00P_6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00P_8 */
      val ASUS_X00P_8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00QD */
      val ASUS_X00QD = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** asus ASUS_X00R_1 */
      val ASUS_X00R_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00R_2 */
      val ASUS_X00R_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00R_3 */
      val ASUS_X00R_3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00R_5 */
      val ASUS_X00R_5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00R_6 */
      val ASUS_X00R_6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00R_7 */
      val ASUS_X00R_7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X00T_2 */
      val ASUS_X00T_2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** asus ASUS_X00T_3 */
      val ASUS_X00T_3 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** asus ASUS_X00T_4 */
      val ASUS_X00T_4 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** asus ASUS_X00T_6 */
      val ASUS_X00T_6 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** asus ASUS_X00T_8 */
      val ASUS_X00T_8 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** asus ASUS_X013D_1 */
      val ASUS_X013D_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X013D_2 */
      val ASUS_X013D_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_X014D_1 */
      val ASUS_X014D_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** asus ASUS_X014D_2 */
      val ASUS_X014D_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** asus ASUS_X017D_1 */
      val ASUS_X017D_1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** asus ASUS_X017D_2 */
      val ASUS_X017D_2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** asus ASUS_X018_1 */
      val ASUS_X018_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X018_2 */
      val ASUS_X018_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** asus ASUS_X018_4 */
      val ASUS_X018_4 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** asus ASUS_X01A_1 */
      val ASUS_X01A_1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** asus ASUS_X01BD_1 */
      val ASUS_X01BD_1 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** asus ASUS_X01BD_2 */
      val ASUS_X01BD_2 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** asus ASUS_X550 */
      val ASUS_X550 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z002 */
      val ASUS_Z002 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z007 */
      val ASUS_Z007 = "spec:width=480,height=854,unit=px,dpi=240"

      /** asus ASUS_Z00D */
      val ASUS_Z00D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00E_1 */
      val ASUS_Z00E_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00E_2 */
      val ASUS_Z00E_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00E_3 */
      val ASUS_Z00E_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00E_4 */
      val ASUS_Z00E_4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00L_63 */
      val ASUS_Z00L_63 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00L_63A */
      val ASUS_Z00L_63A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00L_93 */
      val ASUS_Z00L_93 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00M */
      val ASUS_Z00M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00RD_7 */
      val ASUS_Z00RD_7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00SD */
      val ASUS_Z00SD = "spec:width=480,height=854,unit=px,dpi=240"

      /** asus ASUS_Z00T */
      val ASUS_Z00T = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z00U_1 */
      val ASUS_Z00U_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z00U_2 */
      val ASUS_Z00U_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z00VD */
      val ASUS_Z00VD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00W_63 */
      val ASUS_Z00W_63 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z00YD */
      val ASUS_Z00YD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z010 */
      val ASUS_Z010 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z010_2 */
      val ASUS_Z010_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z010_CD */
      val ASUS_Z010_CD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus ASUS_Z011 */
      val ASUS_Z011 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z012D */
      val ASUS_Z012D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z017D_1 */
      val ASUS_Z017D_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01F_1 */
      val ASUS_Z01F_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01GD_1 */
      val ASUS_Z01GD_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01H_1 */
      val ASUS_Z01H_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01KDA */
      val ASUS_Z01KDA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01KD_1 */
      val ASUS_Z01KD_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01KD_2 */
      val ASUS_Z01KD_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01KD_3 */
      val ASUS_Z01KD_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01M_1 */
      val ASUS_Z01M_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus ASUS_Z01QD */
      val ASUS_Z01QD = "spec:width=900,height=1600,unit=px,dpi=240"

      /** asus ASUS_Z01QD_1 */
      val ASUS_Z01QD_1 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** asus ASUS_Z01R_1 */
      val ASUS_Z01R_1 = "spec:width=1080,height=2246,unit=px,dpi=420"

      /** asus ASUS_ZENBO */
      val ASUS_ZENBO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus K007 */
      val K007 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** asus K00C */
      val K00C = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** asus K00E */
      val K00E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K00F */
      val K00F = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus K00G */
      val K00G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus K00L */
      val K00L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K00R */
      val K00R = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** asus K00U */
      val K00U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K00X */
      val K00X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K00Y */
      val K00Y = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K00Z */
      val K00Z = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K010 */
      val K010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus K010E */
      val K010E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus K011 */
      val K011 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K011_1 */
      val K011_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K012 */
      val K012 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus K012_2 */
      val K012_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus K013 */
      val K013 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K013C */
      val K013C = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K013_1 */
      val K013_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K014 */
      val K014 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** asus K015 */
      val K015 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** asus K016_1 */
      val K016_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K016_2 */
      val K016_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K017 */
      val K017 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus K018 */
      val K018 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus K019_1 */
      val K019_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K019_2 */
      val K019_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K019_3 */
      val K019_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus K019_4 */
      val K019_4 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K01A */
      val K01A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus K01B */
      val K01B = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** asus K01E_2 */
      val K01E_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus K01H */
      val K01H = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** asus K01N_1 */
      val K01N_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus K01N_2 */
      val K01N_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus K01Q */
      val K01Q = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus K01U_1 */
      val K01U_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus me172v */
      val ME172V = "spec:width=600,height=976,unit=px,dpi=160"

      /** asus ME173X */
      val ME173X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus ME301T */
      val ME301T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus ME302C */
      val ME302C = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** asus ME302KL */
      val ME302KL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** asus ME371MG */
      val ME371MG = "spec:width=800,height=1216,unit=px,dpi=213"

      /** asus P001 */
      val P001 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus P001_2 */
      val P001_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus P002_1 */
      val P002_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P002_2 */
      val P002_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P002_M */
      val P002_M = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P008 */
      val P008 = "spec:width=1536,height=2048,unit=px,dpi=360"

      /** asus P008_1 */
      val P008_1 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P008_2 */
      val P008_2 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P00A_2 */
      val P00A_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P00C_2 */
      val P00C_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus P00C_M */
      val P00C_M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus P00I */
      val P00I = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P01M_1 */
      val P01M_1 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P01M_2 */
      val P01M_2 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P01M_3 */
      val P01M_3 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P01M_4 */
      val P01M_4 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P01M_5 */
      val P01M_5 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P01T_1 */
      val P01T_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus P01V_2 */
      val P01V_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P01W */
      val P01W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P01Y */
      val P01Y = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus P01Y_2 */
      val P01Y_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus P01Y_S */
      val P01Y_S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus P01Z */
      val P01Z = "spec:width=600,height=1024,unit=px,dpi=160"

      /** asus P021 */
      val P021 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus P021_1 */
      val P021_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus P022_1 */
      val P022_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P022_2 */
      val P022_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P023_1 */
      val P023_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus P023_2 */
      val P023_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus P024_1 */
      val P024_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P024_2 */
      val P024_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P024_4 */
      val P024_4 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** asus P027 */
      val P027 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** asus P1801-T */
      val P1801_T = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** asus sparrow */
      val SPARROW = "spec:width=320,height=320,unit=px,dpi=280"

      /** asus swift */
      val SWIFT = "spec:width=400,height=400,unit=px,dpi=280"

      /** asus TF201 */
      val TF201 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** asus TF300T */
      val TF300T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus TF300TG */
      val TF300TG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** asus TF700T */
      val TF700T = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** asus TX201LA */
      val TX201LA = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** asus TX201LAF */
      val TX201LAF = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** asus wren */
      val WREN = "spec:width=280,height=280,unit=px,dpi=280"

      /** asus Z008_1 */
      val Z008_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** asus Z00A */
      val Z00A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus Z00A_1 */
      val Z00A_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus Z00A_3 */
      val Z00A_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus Z00X */
      val Z00X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus Z00X_1 */
      val Z00X_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus Z00X_2 */
      val Z00X_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus Z016 */
      val Z016 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus Z016_1 */
      val Z016_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** asus Z01B_1 */
      val Z01B_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
