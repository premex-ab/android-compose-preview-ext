package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UMIDIGI device specifications for Android Compose previews.
 *
 * This extension provides UMIDIGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UMIDIGI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UMIDIGI: Any
  get() = object {
      /** DeviceSpec(manufacturer=UMIDIGI, code=A11, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A11, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A11S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A11S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A11S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A11_Pro_Max, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A11_Pro_Max,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val A11_PRO_MAX = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A11_Tab, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A11_Tab, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val A11_TAB = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A11_Tab-EEA, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A11_Tab-EEA,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val A11_TAB_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A13, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A13, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val A13 = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A13S, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A13S, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val A13S = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A13_Pro, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A13_Pro, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val A13_PRO = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A13_Pro_5G, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A13_Pro_5G,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val A13_PRO_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A13_Pro_Max_5G, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A13_Pro_Max_5G,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val A13_PRO_MAX_5G = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A13_Tab, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A13_Tab, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val A13_TAB = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A13_Tab_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A13_Tab_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val A13_TAB_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A15T, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A15T, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val A15T = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A15_Tab, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A15_Tab, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val A15_TAB = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A15_Tab_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A15_Tab_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val A15_TAB_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A3S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A3S, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A3S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A3X, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A3X, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val A3X = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A3_Pro, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A3_Pro, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val A3_PRO = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A5_Pro, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A5_Pro, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val A5_PRO = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A7, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A7, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A7 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A7S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A7S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A7S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A7_EEA, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A7_EEA, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A7_EEA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A7_Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A7_Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A7_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A9, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A9_Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A9_Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A9_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A9_Pro_128GB, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A9_Pro_128GB,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val A9_PRO_128GB = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=A9_Pro_R, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=A9_Pro_R, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A9_PRO_R = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=AblePad_Pro, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=AblePad_Pro,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val ABLEPAD_PRO = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Active_T1, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Active_T1,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val ACTIVE_T1 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val BISON = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_2, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_2, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val BISON_2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_GT, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_GT, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val BISON_GT = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_GT2, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_GT2,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val BISON_GT2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_GT2_5G, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_GT2_5G,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val BISON_GT2_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_Pro,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val BISON_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_R, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_R, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val BISON_R = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BISON_X10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10G, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10G,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BISON_X10G = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10G_NFC, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10G_NFC,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BISON_X10G_NFC = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10S,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BISON_X10S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10S_NFC, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10S_NFC,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BISON_X10S_NFC = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_X10_Pro,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BISON_X10_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=BISON_X20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=BISON_X20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BISON_X20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=C1_Max, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=C1_Max, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C1_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=C1_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=C1_Plus, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C1_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=F1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=F1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val F1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=F2, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=F2, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val F2 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=F3S, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=F3S, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val F3S = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=F3_5G, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=F3_5G, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val F3_5G = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=F3_Pro_5G, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=F3_Pro_5G,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val F3_PRO_5G = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G100, width=720, height=1640, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G100, width=720,
      height=1640, dpi=480, isGoogleDevice=false).code */
      val G100 = "spec:width=720,height=1640,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G100A, width=720, height=1640, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G100A, width=720,
      height=1640, dpi=480, isGoogleDevice=false).code */
      val G100A = "spec:width=720,height=1640,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Max, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Max, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G1_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Plus, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G1_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G1_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G1_TAB_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G1_TAB_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Kids_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Kids_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G1_TAB_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Mini, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Mini,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G1_TAB_MINI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Mini_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Mini_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G1_TAB_MINI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Mini_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Mini_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G1_TAB_MINI_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G1_Tab_Mini_Kids_EEA, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI,
      code=G1_Tab_Mini_Kids_EEA, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G1_TAB_MINI_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G2_Tab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G2_Tab, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G2_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G2_Tab_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G2_Tab_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G2_TAB_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G2_Tab_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G2_Tab_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G2_TAB_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G2_Tab_Kids_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G2_Tab_Kids_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G2_TAB_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G3_Max, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G3_Max, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val G3_MAX = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G3_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G3_Plus, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G3_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G3_Tab_Ultra, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G3_Tab_Ultra,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val G3_TAB_ULTRA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G5_Mecha, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G5_Mecha, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val G5_MECHA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G5_Tab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G5_Tab, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G5_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G5_Tab_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G5_Tab_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G5_TAB_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G5_Tab_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G5_Tab_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G5_TAB_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G5_Tab_Kids_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G5_Tab_Kids_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G5_TAB_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G6_5G, width=720, height=1616, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G6_5G, width=720,
      height=1616, dpi=320, isGoogleDevice=false).code */
      val G6_5G = "spec:width=720,height=1616,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G7, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G7, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val G7 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G7_Tab_Mini, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G7_Tab_Mini,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val G7_TAB_MINI = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G7_Tab_Pro, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G7_Tab_Pro,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val G7_TAB_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G9A, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G9A, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G9A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G9C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G9C, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G9C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G9T, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G9T, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val G9T = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G9x, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G9x, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G9X = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G9_Tab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G9_Tab, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G9_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=G9_Tab_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=G9_Tab_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val G9_TAB_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Note_100, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Note_100, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val NOTE_100 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Note_100A, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Note_100A, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val NOTE_100A = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Note_100_5G, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Note_100_5G,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val NOTE_100_5G = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=One, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=One, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ONE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=One_Max, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=One_Max, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ONE_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=One_Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=One_Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ONE_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Power, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Power, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val POWER = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Power_3, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Power_3, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val POWER_3 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Power_5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Power_5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val POWER_5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Power_5S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Power_5S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val POWER_5S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Power_7, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Power_7, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val POWER_7 = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Power_7S, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Power_7S, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val POWER_7S = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Power_7_Max, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Power_7_Max,
      width=720, height=1650, dpi=320, isGoogleDevice=false).code */
      val POWER_7_MAX = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=S2_PRO, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=S2_PRO, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S2_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=S3_Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=S3_Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S3_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=S5_Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=S5_Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S5_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_A15, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_A15,
      width=720, height=1650, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_A15 = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_A15C, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_A15C,
      width=720, height=1650, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_A15C = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_C1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_C1,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_C1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_C2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_C2,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_C2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_F3, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_F3,
      width=720, height=1650, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_F3 = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G1,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_G1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G2,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_G2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G3,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_G3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G5, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G5,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_G5 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G5A, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_G5A,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_G5A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_X, width=720, height=1548, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=UMIDIGI_X, width=720,
      height=1548, dpi=320, isGoogleDevice=false).code */
      val UMIDIGI_X = "spec:width=720,height=1548,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Z2, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Z2, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val Z2 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UMIDIGI, code=Z2_PRO, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMIDIGI, code=Z2_PRO, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val Z2_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

  }
