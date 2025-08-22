package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Panasonic device specifications for Android Compose previews.
 *
 * This extension provides Panasonic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Panasonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Panasonic: Any
  get() = object {
      /** Panasonic anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic DMC-CM1 */
      val DMC_CM1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Panasonic Eluga_A2 */
      val ELUGA_A2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_A3 */
      val ELUGA_A3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_A4 */
      val ELUGA_A4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic Eluga_Arc_2 */
      val ELUGA_ARC_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_F */
      val ELUGA_F = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Panasonic ELUGA_I2 */
      val ELUGA_I2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic Eluga_I3 */
      val ELUGA_I3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic Eluga_I3_Mega */
      val ELUGA_I3_MEGA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic Eluga_I6 */
      val ELUGA_I6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Panasonic ELUGA_I7 */
      val ELUGA_I7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Panasonic ELUGA_I7_EE */
      val ELUGA_I7_EE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Panasonic Eluga_I8 */
      val ELUGA_I8 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Panasonic Eluga_Mark_2 */
      val ELUGA_MARK_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_Note */
      val ELUGA_NOTE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Panasonic ELUGA_Prim */
      val ELUGA_PRIM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_Pulse_X */
      val ELUGA_PULSE_X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_Ray */
      val ELUGA_RAY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_Ray_500 */
      val ELUGA_RAY_500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_Ray_530 */
      val ELUGA_RAY_530 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Panasonic ELUGA_Ray_550 */
      val ELUGA_RAY_550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Panasonic ELUGA_Ray_600 */
      val ELUGA_RAY_600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Panasonic ELUGA_Ray_610 */
      val ELUGA_RAY_610 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Panasonic Eluga_Ray_700 */
      val ELUGA_RAY_700 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Panasonic Eluga_Ray_800 */
      val ELUGA_RAY_800 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Panasonic Eluga_Ray_810 */
      val ELUGA_RAY_810 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Panasonic ELUGA_Ray_Max */
      val ELUGA_RAY_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Panasonic ELUGA_Ray_X */
      val ELUGA_RAY_X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_Turbo */
      val ELUGA_TURBO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_U3 */
      val ELUGA_U3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Panasonic ELUGA_WE */
      val ELUGA_WE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic ELUGA_X1 */
      val ELUGA_X1 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** Panasonic ELUGA_Y */
      val ELUGA_Y = "spec:width=720,height=1512,unit=px,dpi=320"

      /** Panasonic ELUGA_Y_Pro */
      val ELUGA_Y_PRO = "spec:width=720,height=1512,unit=px,dpi=320"

      /** Panasonic ELUGA_Z1 */
      val ELUGA_Z1 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Panasonic Jupiter */
      val JUPITER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic kadoma */
      val KADOMA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic OD0M_EA_T32 */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic P100 */
      val P100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic P101 */
      val P101 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Panasonic P55_Novo_4G */
      val P55_NOVO_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic P6 */
      val P6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Panasonic P71 */
      val P71 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic P77 */
      val P77 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic P85 */
      val P85 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic P85Nxt */
      val P85NXT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic P91 */
      val P91 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Panasonic Panasonic_ELUGA_C */
      val PANASONIC_ELUGA_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic Panasonic_P90 */
      val PANASONIC_P90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Panasonic shandao */
      val SHANDAO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Panasonic SPU-A06L-LWG */
      val SPU_A06L_LWG = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Panasonic SW3H_ATV */
      val SW3H_ATV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic SW3_ATV */
      val SW3_ATV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic SW4H_FF */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Panasonic SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Panasonic T44 */
      val T44 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Panasonic Tab_8 */
      val TAB_8 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Panasonic TAB-A05 */
      val TAB_A05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Panasonic TAB-A05-BA1 */
      val TAB_A05_BA1 = "spec:width=1440,height=2960,unit=px,dpi=440"

  }
