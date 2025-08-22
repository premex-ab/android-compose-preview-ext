package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ADVAN device specifications for Android Compose previews.
 *
 * This extension provides ADVAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Advan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Advan: Any
  get() = object {
      /** ADVAN ADVANNASAPro */
      val ADVANNASAPRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ADVAN ADVAN_5041 */
      val ADVAN_5041 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ADVAN ADVAN_5059 */
      val ADVAN_5059 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ADVAN ADVAN_5060 */
      val ADVAN_5060 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ADVAN ADVAN_5061 */
      val ADVAN_5061 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ADVAN ADVAN_5501 */
      val ADVAN_5501 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ADVAN ADVAN_5701 */
      val ADVAN_5701 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ADVAN ADVAN_A8 */
      val ADVAN_A8 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ADVAN ADVAN_E1C4G */
      val ADVAN_E1C4G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ADVAN ADVAN_E1C_3G */
      val ADVAN_E1C_3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ADVAN ADVAN_E1C_NXT */
      val ADVAN_E1C_NXT = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ADVAN ADVAN_G2 */
      val ADVAN_G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ADVAN ADVAN_G2_Pro */
      val ADVAN_G2_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ADVAN ADVAN_G3 */
      val ADVAN_G3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ADVAN ADVAN_G3_Pro */
      val ADVAN_G3_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ADVAN ADVAN_G5 */
      val ADVAN_G5 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ADVAN ADVAN_G5_Elite */
      val ADVAN_G5_ELITE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ADVAN ADVAN_G5_Plus */
      val ADVAN_G5_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ADVAN ADVAN_G9 */
      val ADVAN_G9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ADVAN ADVAN_GX */
      val ADVAN_GX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** ADVAN ADVAN_G_Tab */
      val ADVAN_G_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVAN ADVAN_i4U */
      val ADVAN_I4U = "spec:width=480,height=800,unit=px,dpi=240"

      /** ADVAN ADVAN_i55D */
      val ADVAN_I55D = "spec:width=480,height=960,unit=px,dpi=240"

      /** ADVAN ADVAN_i55K */
      val ADVAN_I55K = "spec:width=640,height=1280,unit=px,dpi=320"

      /** ADVAN ADVAN_i5C_Plus */
      val ADVAN_I5C_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ADVAN ADVAN_i5D */
      val ADVAN_I5D = "spec:width=480,height=960,unit=px,dpi=240"

      /** ADVAN ADVAN_I5E */
      val ADVAN_I5E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ADVAN ADVAN_i5G */
      val ADVAN_I5G = "spec:width=480,height=854,unit=px,dpi=240"

      /** ADVAN ADVAN_i6C */
      val ADVAN_I6C = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ADVAN ADVAN_I7D */
      val ADVAN_I7D = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ADVAN ADVAN_i_Lite */
      val ADVAN_I_LITE = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ADVAN ADVAN_i_Tab */
      val ADVAN_I_TAB = "spec:width=720,height=1280,unit=px,dpi=240"

      /** ADVAN ADVAN_M4 */
      val ADVAN_M4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** ADVAN ADVAN_NASA */
      val ADVAN_NASA = "spec:width=540,height=960,unit=px,dpi=240"

      /** ADVAN ADVAN_NASA_Plus */
      val ADVAN_NASA_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** ADVAN ADVAN_S40 */
      val ADVAN_S40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** ADVAN ADVAN_S4Z */
      val ADVAN_S4Z = "spec:width=480,height=800,unit=px,dpi=240"

      /** ADVAN ADVAN_S50_Prime */
      val ADVAN_S50_PRIME = "spec:width=480,height=854,unit=px,dpi=240"

      /** ADVAN ADVAN_S5E_FULL_VIEW */
      val ADVAN_S5E_FULL_VIEW = "spec:width=480,height=960,unit=px,dpi=240"

      /** ADVAN ADVAN_S6_Plus */
      val ADVAN_S6_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** ADVAN ADVAN_S7C */
      val ADVAN_S7C = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ADVAN ADVAN_SKETSA3 */
      val ADVAN_SKETSA3 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** ADVAN ADVAN_SKETSA_2 */
      val ADVAN_SKETSA_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVAN ADVAN_TAB_10 */
      val ADVAN_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** ADVAN ADVAN_TAB_7 */
      val ADVAN_TAB_7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ADVAN ADVAN_TAB_8 */
      val ADVAN_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** ADVAN ADVAN_TAB_A8 */
      val ADVAN_TAB_A8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVAN ADVAN_TAB_A8_PLUS */
      val ADVAN_TAB_A8_PLUS = "spec:width=800,height=1280,unit=px,dpi=200"

      /** ADVAN ADVAN_TAB_Gallilea */
      val ADVAN_TAB_GALLILEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ADVAN ADVAN_TAB_VX */
      val ADVAN_TAB_VX = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** ADVAN ADVAN_TAB_VX_LITE */
      val ADVAN_TAB_VX_LITE = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** ADVAN ADVAN_VX_NEO */
      val ADVAN_VX_NEO = "spec:width=800,height=1280,unit=px,dpi=320"

      /** ADVAN ADVAN_X1 */
      val ADVAN_X1 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** ADVAN ADVAN_X7_Pro */
      val ADVAN_X7_PRO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ADVAN ADVAN_XTAB */
      val ADVAN_XTAB = "spec:width=800,height=1280,unit=px,dpi=200"

      /** ADVAN i10 */
      val I10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** ADVAN i5C */
      val I5C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ADVAN T2J */
      val T2J = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ADVAN X7_Max */
      val X7_MAX = "spec:width=600,height=1024,unit=px,dpi=213"

  }
