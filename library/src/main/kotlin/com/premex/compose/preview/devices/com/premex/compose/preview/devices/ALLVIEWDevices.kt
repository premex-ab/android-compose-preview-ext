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
      /** DeviceSpec(manufacturer=ALLVIEW, code=A10_Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A10_Lite, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A10_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A10_Lite_2019, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A10_Lite_2019,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val A10_LITE_2019 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A10_Lite_2GB, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A10_Lite_2GB,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val A10_LITE_2GB = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A10_Max, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A10_Max, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A10_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A20_Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A20_Lite, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A20_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A20_Max, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A20_Max, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val A20_MAX = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A30_Max, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A30_Max, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A30_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A30_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A30_Plus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A30_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A5_Easy, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A5_Easy, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A5_EASY = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A5_Ready, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A5_Ready, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A5_READY = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A9_Lite, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A9_Lite, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A9_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=A9_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=A9_Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A9_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=AX501Q, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=AX501Q, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val AX501Q = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ALLVIEW, code=AX503, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=AX503, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val AX503 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=AX503_Q, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=AX503_Q, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val AX503_Q = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=C1004, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=C1004, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C1004 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=H1003_LTE_PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=H1003_LTE_PRO,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val H1003_LTE_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=H1003_LTE_PRO1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=H1003_LTE_PRO1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val H1003_LTE_PRO1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=H1003_LTE_PRO1_64, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=H1003_LTE_PRO1_64,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val H1003_LTE_PRO1_64 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=H1003_LTE_PRO3, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=H1003_LTE_PRO3,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val H1003_LTE_PRO3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=H1004_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=H1004_LTE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H1004_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P10_Max, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P10_Max, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P10_MAX = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P10_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P10_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P10_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P41_eMagic, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P41_eMagic,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val P41_EMAGIC = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P4_Pro, width=768, height=1280, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P4_Pro, width=768,
      height=1280, dpi=360, isGoogleDevice=false).code */
      val P4_PRO = "spec:width=768,height=1280,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P5_eMagic, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P5_eMagic, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P5_EMAGIC = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P5_Energy, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P5_Energy, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P5_ENERGY = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P7_Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P7_Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P7_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P7_PRO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P7_PRO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P7_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P8_eMagic, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P8_eMagic, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P8_EMAGIC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P8_Energy, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P8_Energy, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P8_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P8_Energy_mini, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P8_Energy_mini,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val P8_ENERGY_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P8_Life, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P8_Life, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P8_LIFE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P8_PRO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P8_PRO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P8_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P9_Energy, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P9_Energy,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val P9_ENERGY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P9_Energy_Lite_2017, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW,
      code=P9_Energy_Lite_2017, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val P9_ENERGY_LITE_2017 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P9_Energy_mini, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P9_Energy_mini,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val P9_ENERGY_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=P9_Energy_S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=P9_Energy_S,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val P9_ENERGY_S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=SW4H_FF, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=SW4H_FF, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=V10_Viper, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=V10_Viper, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val V10_VIPER = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=V10_Viper_Lite, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=V10_Viper_Lite,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val V10_VIPER_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=V2_Viper_S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=V2_Viper_S,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val V2_VIPER_S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=V2_Viper_X_plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=V2_Viper_X_plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val V2_VIPER_X_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=V3_Viper, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=V3_Viper, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V3_VIPER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=V4_Viper, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=V4_Viper, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val V4_VIPER = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=V4_Viper_PRO, width=640, height=1352, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=V4_Viper_PRO,
      width=640, height=1352, dpi=240, isGoogleDevice=false).code */
      val V4_VIPER_PRO = "spec:width=640,height=1352,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=V5_Viper, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=V5_Viper, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val V5_VIPER = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_1003G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_1003G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val VIVA_1003G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_1003G_Lite, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_1003G_Lite,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VIVA_1003G_LITE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_1003G_Lite_Q, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_1003G_Lite_Q,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VIVA_1003G_LITE_Q = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_803G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_803G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val VIVA_803G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_C703, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_C703, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VIVA_C703 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_H1001_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_H1001_LTE,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VIVA_H1001_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_H1002_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_H1002_LTE,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VIVA_H1002_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_H1003_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_H1003_LTE,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VIVA_H1003_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_H701_LTE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_H701_LTE,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val VIVA_H701_LTE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ALLVIEW, code=Viva_H802_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=Viva_H802_LTE,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VIVA_H802_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X10_Soul, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X10_Soul, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X10_SOUL = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X10_Soul_Lite, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X10_Soul_Lite,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val X10_SOUL_LITE = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X20_Soul, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X20_Soul, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val X20_SOUL = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X3_Soul_Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X3_Soul_Lite,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X3_SOUL_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X3_Soul_PLUS, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X3_Soul_PLUS,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val X3_SOUL_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X3_Soul_Style, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X3_Soul_Style,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val X3_SOUL_STYLE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Infinity_N, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Infinity_N,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X4_SOUL_INFINITY_N = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Infinity_NV, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW,
      code=X4_Soul_Infinity_NV, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X4_SOUL_INFINITY_NV = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Infinity_S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Infinity_S,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X4_SOUL_INFINITY_S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Infinity_SV, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW,
      code=X4_Soul_Infinity_SV, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X4_SOUL_INFINITY_SV = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Infinity_Z, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Infinity_Z,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X4_SOUL_INFINITY_Z = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Lite, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Lite,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val X4_SOUL_LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Mini, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Mini,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X4_SOUL_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Plus, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Plus,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val X4_SOUL_PLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Style, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Style,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val X4_SOUL_STYLE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Xtreme, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X4_Soul_Xtreme,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val X4_SOUL_XTREME = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X5_Soul, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X5_Soul, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X5_SOUL = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X5_Soul_Mini, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X5_Soul_Mini,
      width=720, height=1498, dpi=320, isGoogleDevice=false).code */
      val X5_SOUL_MINI = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X5_Soul_Pro, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X5_Soul_Pro,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val X5_SOUL_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X5_Soul_Style, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X5_Soul_Style,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val X5_SOUL_STYLE = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X6_Soul_Xtreme, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X6_Soul_Xtreme,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val X6_SOUL_XTREME = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X7_Soul_Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X7_Soul_Pro,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val X7_SOUL_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X7_Soul_Style, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X7_Soul_Style,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val X7_SOUL_STYLE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X8_Soul_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X8_Soul_Pro,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val X8_SOUL_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALLVIEW, code=X8_Soul_Style, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLVIEW, code=X8_Soul_Style,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val X8_SOUL_STYLE = "spec:width=720,height=1640,unit=px,dpi=320"

  }
