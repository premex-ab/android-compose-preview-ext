package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Haier device specifications for Android Compose previews.
 *
 * This extension provides Haier device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Haier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Haier: Any
  get() = object {
      /** Haier A1 */
      val A1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Haier A3 */
      val A3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Haier A4_Lite */
      val A4_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Haier broadway */
      val BROADWAY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Haier burrard */
      val BURRARD = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Haier daan */
      val DAAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Haier deto */
      val DETO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Haier dupont */
      val DUPONT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Haier E13 */
      val E13 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Haier E7 */
      val E7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Haier E9 */
      val E9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Haier Haier_L52 */
      val HAIER_L52 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Haier Haier_Leisure_L7 */
      val HAIER_LEISURE_L7 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Haier hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Haier HM-G553-FL */
      val HM_G553_FL = "spec:width=480,height=854,unit=px,dpi=240"

      /** Haier hongik */
      val HONGIK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Haier I4 */
      val I4 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** Haier I6_Infinity */
      val I6_INFINITY = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Haier irvine */
      val IRVINE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Haier jordan */
      val JORDAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Haier LE32U5000A */
      val LE32U5000A = "spec:width=720,height=1280,unit=px,dpi=160"

      /** Haier LE40U5000A */
      val LE40U5000A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Haier LE43U5000A */
      val LE43U5000A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Haier LE49U5000A */
      val LE49U5000A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Haier M5352401 */
      val M5352401 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Haier M53-52401 */
      val M53_52401 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Haier nippori */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Haier omonia */
      val OMONIA = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Haier P10 */
      val P10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Haier P11 */
      val P11 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Haier P20 */
      val P20 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Haier P20_Tablet_PC */
      val P20_TABLET_PC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Haier PAD1042 */
      val PAD1042 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Haier S5_Silk */
      val S5_SILK = "spec:width=480,height=960,unit=px,dpi=240"

      /** Haier SW4H_FF */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Haier Tablet_P20 */
      val TABLET_P20 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Haier Titan_T3 */
      val TITAN_T3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Haier Titan_T5 */
      val TITAN_T5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Haier uguisudani */
      val UGUISUDANI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Haier yongchun */
      val YONGCHUN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Haier YQB */
      val YQB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
