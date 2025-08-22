package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BQru device specifications for Android Compose previews.
 *
 * This extension provides BQru device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BQru.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BQru: Any
  get() = object {
      /** DeviceSpec(manufacturer=BQru, code=BQru, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1020L, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1020L, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_1020L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1022L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1022L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1022L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1024L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1024L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BQRU_1024L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1025L, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1025L, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val BQRU_1025L = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1045, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1045, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1045 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1045G_2019, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1045G_2019,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1045G_2019 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1045G_A11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1045G_A11,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1045G_A11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru_1056L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_1056L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1056L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1077L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1077L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1077L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1077L_2019, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1077L_2019,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1077L_2019 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1081G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1081G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_1081G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1081G_2019, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1081G_2019,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_1081G_2019 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1082G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1082G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_1082G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1082G_2019, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1082G_2019,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_1082G_2019 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1082G_2020, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1082G_2020,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_1082G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1083G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1083G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1083G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1083G_2019, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1083G_2019,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1083G_2019 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1083G_2020, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1083G_2020,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1083G_2020 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1084L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1084L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1084L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1085L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1085L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_1085L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-1085L_2020, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-1085L_2020,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val BQRU_1085L_2020 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-4028, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-4028, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val BQRU_4028 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-4030G, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-4030G, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val BQRU_4030G = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru_4072, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_4072, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val BQRU_4072 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-4500, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-4500, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_4500 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-4501G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-4501G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_4501G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-4583, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-4583, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_4583 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5000G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5000G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_5000G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5002G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5002G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_5002G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5003L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5003L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5003L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5005L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5005L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5005L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5007L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5007L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5007L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5009L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5009L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5009L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5010G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5010G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5010G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5011G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5011G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5011G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5012L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5012L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5012L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5016G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5016G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5016G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5031G, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5031G, width=720,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val BQRU_5031G = "spec:width=720,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5033, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5033, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5033 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5035, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5035, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_5035 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5037, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5037, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5037 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5044, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5044, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5044 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5045L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5045L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5045L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5047L, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5047L, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_5047L = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5056, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5056, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val BQRU_5056 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5057, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5057, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5057 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5058, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5058, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_5058 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5059, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5059, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5059 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5060, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5060, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5060 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5060L, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5060L, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_5060L = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5060L_9832E, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5060L_9832E,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BQRU_5060L_9832E = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5201, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5201, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5201 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5202, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5202, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5202 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5203, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5203, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5203 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5204, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5204, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5204 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5206L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5206L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5206L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5211, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5211, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5211 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5300G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5300G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5300G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5302G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5302G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5302G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5340, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5340, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5340 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5500L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5500L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5500L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5504, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5504, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5504 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5508L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5508L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5508L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5510, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5510, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5510 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5512L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5512L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5512L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5514G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5514G, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5514G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5514L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5514L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5514L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5515L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5515L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5515L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5516L, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5516L, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BQRU_5516L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5517L, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5517L, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BQRU_5517L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5518G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5518G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5518G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5519G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5519G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5519G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5519L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5519L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5519L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5520L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5520L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5520L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5521L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5521L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5521L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5522, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5522, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5522 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5528L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5528L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5528L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5530L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5530L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5530L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5533G, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5533G, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val BQRU_5533G = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5535L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5535L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5535L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5540L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5540L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5540L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5541L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5541L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5541L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5560L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5560L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5560L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5565L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5565L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5565L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5591, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5591, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5591 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5594, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5594, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_5594 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5700L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5700L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5700L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5701L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5701L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5701L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_5702, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_5702, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5702 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5707G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5707G, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5707G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5730L, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5730L, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val BQRU_5730L = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5731L, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5731L, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val BQRU_5731L = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5732L, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5732L, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val BQRU_5732L = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5740G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5740G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5740G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5740G_7731, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5740G_7731,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_5740G_7731 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5745L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5745L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5745L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-5765L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-5765L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_5765L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6000L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6000L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_6000L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6001L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6001L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_6001L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_6010G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_6010G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_6010G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6015L, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6015L, width=720,
      height=1528, dpi=280, isGoogleDevice=false).code */
      val BQRU_6015L = "spec:width=720,height=1528,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6016L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6016L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_6016L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_6022G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_6022G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_6022G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6022G, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6022G, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val BQRU_6022G = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6030G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6030G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_6030G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6030G_7731, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6030G_7731,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_6030G_7731 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6035L, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6035L, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val BQRU_6035L = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6040L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6040L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BQRU_6040L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6042L, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6042L, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val BQRU_6042L = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6045L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6045L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BQRU_6045L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6061L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6061L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BQRU_6061L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6065L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6065L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BQRU_6065L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6200L, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6200L, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val BQRU_6200L = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6353L, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6353L, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val BQRU_6353L = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6424L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6424L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BQRU_6424L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru_6430L, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru_6430L, width=1080,
      height=2310, dpi=480, isGoogleDevice=false).code */
      val BQRU_6430L = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6630L, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6630L, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BQRU_6630L = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6631G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6631G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQRU_6631G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6631G_A11, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6631G_A11,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BQRU_6631G_A11 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6645L, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6645L, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val BQRU_6645L = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-6868L, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-6868L, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BQRU_6868L = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7000G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7000G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7000G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7000G_2020, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7000G_2020,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_7000G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7036L, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7036L, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7036L = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7038G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7038G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7038G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7040G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7040G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7040G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7040G_2020, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7040G_2020,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_7040G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7081, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7081, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7081 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7082, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7082, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7082 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7082G_2019, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7082G_2019,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7082G_2019 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7082G_2020, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7082G_2020,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_7082G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7083, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7083, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7083 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7083G_Plus, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7083G_Plus,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7083G_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7098G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7098G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQRU_7098G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-7098G_2020, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-7098G_2020,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BQRU_7098G_2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BQru, code=BQru-8068L, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-8068L, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val BQRU_8068L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BQru, code=BQru-8068L_A11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-8068L_A11,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_8068L_A11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-8077L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-8077L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_8077L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQru-9055L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQru-9055L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQRU_9055L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQ-1025L, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQ-1025L, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BQ_1025L = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQ_1036L, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQ_1036L, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val BQ_1036L = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BQru, code=BQ-5046L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQ-5046L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BQ_5046L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BQru, code=BQ-7055L, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQ-7055L, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BQ_7055L = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BQru, code=BQ_8088L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BQru, code=BQ_8088L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BQ_8088L = "spec:width=800,height=1280,unit=px,dpi=213"

  }
