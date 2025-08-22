package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALLVIEW device specifications for Android Compose previews.
 *
 * This extension provides ALLVIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALLVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALLVIEW: Any
  get() = object {
      /** ALLVIEW A10_Lite */
      val A10_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALLVIEW A10_Lite_2019 */
      val A10_LITE_2019 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALLVIEW A10_Lite_2GB */
      val A10_LITE_2GB = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALLVIEW A10_Max */
      val A10_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW A20_Lite */
      val A20_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALLVIEW A20_Max */
      val A20_MAX = "spec:width=480,height=1014,unit=px,dpi=213"

      /** ALLVIEW A30_Max */
      val A30_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ALLVIEW A30_Plus */
      val A30_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW A5_Easy */
      val A5_EASY = "spec:width=480,height=800,unit=px,dpi=240"

      /** ALLVIEW A5_Ready */
      val A5_READY = "spec:width=480,height=800,unit=px,dpi=240"

      /** ALLVIEW A9_Lite */
      val A9_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** ALLVIEW A9_Plus */
      val A9_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALLVIEW AX501Q */
      val AX501Q = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ALLVIEW AX503 */
      val AX503 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** ALLVIEW AX503_Q */
      val AX503_Q = "spec:width=600,height=1024,unit=px,dpi=240"

      /** ALLVIEW bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ALLVIEW C1004 */
      val C1004 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW H1003_LTE_PRO */
      val H1003_LTE_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW H1003_LTE_PRO1 */
      val H1003_LTE_PRO1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW H1003_LTE_PRO1_64 */
      val H1003_LTE_PRO1_64 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW H1003_LTE_PRO3 */
      val H1003_LTE_PRO3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW H1004_LTE */
      val H1004_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ALLVIEW P10_Max */
      val P10_MAX = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALLVIEW P10_Pro */
      val P10_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW P41_eMagic */
      val P41_EMAGIC = "spec:width=480,height=800,unit=px,dpi=240"

      /** ALLVIEW P4_Pro */
      val P4_PRO = "spec:width=768,height=1280,unit=px,dpi=360"

      /** ALLVIEW P5_eMagic */
      val P5_EMAGIC = "spec:width=480,height=854,unit=px,dpi=240"

      /** ALLVIEW P5_Energy */
      val P5_ENERGY = "spec:width=480,height=854,unit=px,dpi=240"

      /** ALLVIEW P7_Lite */
      val P7_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW P7_PRO */
      val P7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW P8_eMagic */
      val P8_EMAGIC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW P8_Energy */
      val P8_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW P8_Energy_mini */
      val P8_ENERGY_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW P8_Life */
      val P8_LIFE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW P8_PRO */
      val P8_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW P9_Energy */
      val P9_ENERGY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW P9_Energy_Lite_2017 */
      val P9_ENERGY_LITE_2017 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW P9_Energy_mini */
      val P9_ENERGY_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW P9_Energy_S */
      val P9_ENERGY_S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW SW4H_FF */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ALLVIEW V10_Viper */
      val V10_VIPER = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ALLVIEW V10_Viper_Lite */
      val V10_VIPER_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ALLVIEW V2_Viper_S */
      val V2_VIPER_S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW V2_Viper_X_plus */
      val V2_VIPER_X_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW V3_Viper */
      val V3_VIPER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW V4_Viper */
      val V4_VIPER = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ALLVIEW V4_Viper_PRO */
      val V4_VIPER_PRO = "spec:width=640,height=1352,unit=px,dpi=240"

      /** ALLVIEW V5_Viper */
      val V5_VIPER = "spec:width=480,height=1014,unit=px,dpi=213"

      /** ALLVIEW Viva_1003G */
      val VIVA_1003G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ALLVIEW Viva_1003G_Lite */
      val VIVA_1003G_LITE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW Viva_1003G_Lite_Q */
      val VIVA_1003G_LITE_Q = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW Viva_803G */
      val VIVA_803G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** ALLVIEW Viva_C703 */
      val VIVA_C703 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ALLVIEW Viva_H1001_LTE */
      val VIVA_H1001_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW Viva_H1002_LTE */
      val VIVA_H1002_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW Viva_H1003_LTE */
      val VIVA_H1003_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW Viva_H701_LTE */
      val VIVA_H701_LTE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ALLVIEW Viva_H802_LTE */
      val VIVA_H802_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ALLVIEW X10_Soul */
      val X10_SOUL = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ALLVIEW X10_Soul_Lite */
      val X10_SOUL_LITE = "spec:width=720,height=1612,unit=px,dpi=280"

      /** ALLVIEW X20_Soul */
      val X20_SOUL = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** ALLVIEW X3_Soul_Lite */
      val X3_SOUL_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW X3_Soul_PLUS */
      val X3_SOUL_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW X3_Soul_Style */
      val X3_SOUL_STYLE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW X4_Soul_Infinity_N */
      val X4_SOUL_INFINITY_N = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW X4_Soul_Infinity_NV */
      val X4_SOUL_INFINITY_NV = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW X4_Soul_Infinity_S */
      val X4_SOUL_INFINITY_S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW X4_Soul_Infinity_SV */
      val X4_SOUL_INFINITY_SV = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW X4_Soul_Infinity_Z */
      val X4_SOUL_INFINITY_Z = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALLVIEW X4_Soul_Lite */
      val X4_SOUL_LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW X4_Soul_Mini */
      val X4_SOUL_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALLVIEW X4_Soul_Plus */
      val X4_SOUL_PLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** ALLVIEW X4_Soul_Style */
      val X4_SOUL_STYLE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW X4_Soul_Xtreme */
      val X4_SOUL_XTREME = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALLVIEW X5_Soul */
      val X5_SOUL = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ALLVIEW X5_Soul_Mini */
      val X5_SOUL_MINI = "spec:width=720,height=1498,unit=px,dpi=320"

      /** ALLVIEW X5_Soul_Pro */
      val X5_SOUL_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** ALLVIEW X5_Soul_Style */
      val X5_SOUL_STYLE = "spec:width=720,height=1500,unit=px,dpi=320"

      /** ALLVIEW X6_Soul_Xtreme */
      val X6_SOUL_XTREME = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** ALLVIEW X7_Soul_Pro */
      val X7_SOUL_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** ALLVIEW X7_Soul_Style */
      val X7_SOUL_STYLE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ALLVIEW X8_Soul_Pro */
      val X8_SOUL_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** ALLVIEW X8_Soul_Style */
      val X8_SOUL_STYLE = "spec:width=720,height=1640,unit=px,dpi=320"

  }
