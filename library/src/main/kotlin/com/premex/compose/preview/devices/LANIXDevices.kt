package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LANIX device specifications for Android Compose previews.
 *
 * This extension provides LANIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LANIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LANIX: Any
  get() = object {
      /** LANIX Alpha_950 */
      val ALPHA_950 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LANIX Alpha_950XL */
      val ALPHA_950XL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LANIX IliumPad_RX10 */
      val ILIUMPAD_RX10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LANIX IliumPad_RX10v3 */
      val ILIUMPAD_RX10V3 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** LANIX ILIUMPAD_RX10v5 */
      val ILIUMPAD_RX10V5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LANIX IliumPad_RX7 */
      val ILIUMPAD_RX7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LANIX Ilium_Alpha7 */
      val ILIUM_ALPHA7 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** LANIX Ilium_Alpha_1s */
      val ILIUM_ALPHA_1S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** LANIX Ilium_Alpha_3 */
      val ILIUM_ALPHA_3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LANIX Ilium_Alpha_5s */
      val ILIUM_ALPHA_5S = "spec:width=720,height=1520,unit=px,dpi=280"

      /** LANIX Ilium_L1100 */
      val ILIUM_L1100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LANIX Ilium_L1120 */
      val ILIUM_L1120 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LANIX Ilium_L1400 */
      val ILIUM_L1400 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LANIX ILIUM_L200 */
      val ILIUM_L200 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LANIX Ilium_L620 */
      val ILIUM_L620 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LANIX Ilium_L910 */
      val ILIUM_L910 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LANIX Ilium_L920 */
      val ILIUM_L920 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LANIX Ilium_LT520 */
      val ILIUM_LT520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LANIX Ilium_M1 */
      val ILIUM_M1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LANIX Ilium_M3 */
      val ILIUM_M3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LANIX Ilium_M5 */
      val ILIUM_M5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LANIX Ilium_M5s */
      val ILIUM_M5S = "spec:width=480,height=960,unit=px,dpi=240"

      /** LANIX Ilium_M7 */
      val ILIUM_M7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LANIX Ilium_M7s */
      val ILIUM_M7S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LANIX Ilium_M7V */
      val ILIUM_M7V = "spec:width=480,height=960,unit=px,dpi=240"

      /** LANIX Ilium_M9 */
      val ILIUM_M9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LANIX Ilium_M9s */
      val ILIUM_M9S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LANIX Ilium_M9V */
      val ILIUM_M9V = "spec:width=720,height=1560,unit=px,dpi=320"

      /** LANIX iLium_Pad_E10Si_1 */
      val ILIUM_PAD_E10SI_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LANIX Ilium_PAD_RX8 */
      val ILIUM_PAD_RX8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LANIX ILIUM_PAD_RX8_v5 */
      val ILIUM_PAD_RX8_V5 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LANIX ILIUM_X110 */
      val ILIUM_X110 = "spec:width=320,height=480,unit=px,dpi=160"

      /** LANIX Ilium_X200 */
      val ILIUM_X200 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LANIX Ilium_X210 */
      val ILIUM_X210 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LANIX Ilium_X220 */
      val ILIUM_X220 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LANIX Ilium_X500B */
      val ILIUM_X500B = "spec:width=480,height=854,unit=px,dpi=240"

      /** LANIX Ilium_X510 */
      val ILIUM_X510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LANIX Ilium_X520 */
      val ILIUM_X520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LANIX Ilium_X710 */
      val ILIUM_X710 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LANIX M1R */
      val M1R = "spec:width=480,height=1014,unit=px,dpi=200"

      /** LANIX RX7V4 */
      val RX7V4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LANIX RX7_v3 */
      val RX7_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LANIX stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** LANIX X1S */
      val X1S = "spec:width=480,height=854,unit=px,dpi=200"

      /** LANIX X230 */
      val X230 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LANIX X240 */
      val X240 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LANIX X5 */
      val X5 = "spec:width=480,height=960,unit=px,dpi=200"

      /** LANIX X530 */
      val X530 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LANIX X540 */
      val X540 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LANIX X550 */
      val X550 = "spec:width=480,height=854,unit=px,dpi=200"

      /** LANIX X7 */
      val X7 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** LANIX zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
