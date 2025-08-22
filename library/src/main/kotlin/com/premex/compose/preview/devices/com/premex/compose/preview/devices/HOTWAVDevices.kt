package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOTWAV device specifications for Android Compose previews.
 *
 * This extension provides HOTWAV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOTWAV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOTWAV: Any
  get() = object {
      /** DeviceSpec(manufacturer=HOTWAV, code=Cosmos_U, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cosmos_U, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val COSMOS_U = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HOTWAV, code=Cyber_13, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cyber_13, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val CYBER_13 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=HOTWAV, code=Cyber_13_Pro, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cyber_13_Pro,
      width=1080, height=2408, dpi=440, isGoogleDevice=false).code */
      val CYBER_13_PRO = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=HOTWAV, code=Cyber_15, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cyber_15, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val CYBER_15 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HOTWAV, code=Cyber_7, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cyber_7, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CYBER_7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HOTWAV, code=Cyber_8, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cyber_8, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CYBER_8 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Cyber_9_Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cyber_9_Pro,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val CYBER_9_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Cyber_X, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cyber_X, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val CYBER_X = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HOTWAV, code=Cyber_X_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Cyber_X_Pro,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val CYBER_X_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HOTWAV, code=H1, width=480, height=1014, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=H1, width=480,
      height=1014, dpi=240, isGoogleDevice=false).code */
      val H1 = "spec:width=480,height=1014,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HOTWAV, code=HOT_6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=HOT_6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HOT_6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Hyper_7, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Hyper_7, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val HYPER_7 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HOTWAV, code=Hyper_7_Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Hyper_7_Pro,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val HYPER_7_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HOTWAV, code=M5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=M5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=M5i, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=M5i, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M5I = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=M5_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=M5_Plus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=M6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=M6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Note_12_2024, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Note_12_2024,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val NOTE_12_2024 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Note_12_EF, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Note_12_EF, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val NOTE_12_EF = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Note_13, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Note_13, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NOTE_13 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Note_13_Max, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Note_13_Max,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val NOTE_13_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Note_13_Pro, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Note_13_Pro,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val NOTE_13_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Note_15, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Note_15, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NOTE_15 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Note_15_Pro, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Note_15_Pro,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val NOTE_15_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Note_16, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Note_16, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val NOTE_16 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Pad_11_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Pad_11_EEA,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val PAD_11_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Pad_8, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Pad_8, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val PAD_8 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Pearl_K1, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Pearl_K1, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PEARL_K1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Pearl_K2, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Pearl_K2, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PEARL_K2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Pearl_K2_Prime, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Pearl_K2_Prime,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val PEARL_K2_PRIME = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Pearl_K3, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Pearl_K3, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val PEARL_K3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Symbol, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Symbol, width=720,
      height=1498, dpi=320, isGoogleDevice=false).code */
      val SYMBOL = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Symbol_Max, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Symbol_Max, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val SYMBOL_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=Symbol_X, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=Symbol_X, width=720,
      height=1498, dpi=320, isGoogleDevice=false).code */
      val SYMBOL_X = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=T5_Pro, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=T5_Pro, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val T5_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HOTWAV, code=T7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=T7, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val T7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=T7_Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=T7_Pro, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val T7_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HOTWAV, code=TAB_R5, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=TAB_R5, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_R5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOTWAV, code=TAB_R6_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=TAB_R6_Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_R6_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOTWAV, code=TAB_R6_Ultra, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=TAB_R6_Ultra,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TAB_R6_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=TAB_R7, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=TAB_R7, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_R7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOTWAV, code=TAB_R8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=TAB_R8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_R8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOTWAV, code=TAB_R9_Pro, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=TAB_R9_Pro,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_R9_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HOTWAV, code=W10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=W10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val W10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=W10_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=W10_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val W10_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOTWAV, code=W11, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOTWAV, code=W11, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val W11 = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
