package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kruger_Matz device specifications for Android Compose previews.
 *
 * This extension provides Kruger_Matz device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KrugerMatz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KrugerMatz: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kruger_Matz, code=DRIVE9, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=DRIVE9,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val DRIVE9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=DRIVE_6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=DRIVE_6,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val DRIVE_6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=DRIVE_6S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=DRIVE_6S,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val DRIVE_6S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=DRIVE_8, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=DRIVE_8,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val DRIVE_8 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1066, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1066,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val EAGLE_1066 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1067, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1067,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val EAGLE_1067 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1068, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1068,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val EAGLE_1068 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1069, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1069,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val EAGLE_1069 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1072, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1072,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val EAGLE_1072 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1073, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_1073,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val EAGLE_1073 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=Eagle_702, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=Eagle_702,
      width=720, height=1280, dpi=300, isGoogleDevice=false).code */
      val EAGLE_702 = "spec:width=720,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=Eagle_806, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=Eagle_806,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val EAGLE_806 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_961, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=EAGLE_961,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val EAGLE_961 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=FLOW5PLUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=FLOW5PLUS,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val FLOW5PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=FLOW6Lite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=FLOW6Lite,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val FLOW6LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=FLOW7, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=FLOW7, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val FLOW7 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=FLOW_11, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=FLOW_11,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val FLOW_11 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=FLOW_5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=FLOW_5,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val FLOW_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=Flow_7S, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=Flow_7S,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val FLOW_7S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=Flow_9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=Flow_9,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val FLOW_9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM0708, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM0708,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KM0708 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM08061, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM08061,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KM08061 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM0807, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM0807,
      width=1200, height=1920, dpi=360, isGoogleDevice=false).code */
      val KM0807 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM0808, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM0808,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KM0808 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM1008, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM1008,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KM1008 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM1070, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM1070,
      width=1200, height=1920, dpi=360, isGoogleDevice=false).code */
      val KM1070 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM1074, width=1200, height=2000, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM1074,
      width=1200, height=2000, dpi=340, isGoogleDevice=false).code */
      val KM1074 = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM1075, width=1200, height=2000, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM1075,
      width=1200, height=2000, dpi=340, isGoogleDevice=false).code */
      val KM1075 = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=KM1076, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=KM1076,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val KM1076 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_11, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_11,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val LIVE_11 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_12, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_12,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val LIVE_12 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_6plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_6plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val LIVE_6PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_7, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_7,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val LIVE_7 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_7S, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=LIVE_7S,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val LIVE_7S = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=Live_8, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=Live_8,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val LIVE_8 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=Live_9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=Live_9,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LIVE_9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=Live_9S, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=Live_9S,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val LIVE_9S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=MOVE8mini, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=MOVE8mini,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MOVE8MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=MOVE9, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=MOVE9, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val MOVE9 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kruger_Matz, code=MOVE_8_1, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kruger_Matz, code=MOVE_8_1,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val MOVE_8_1 = "spec:width=640,height=1280,unit=px,dpi=320"

  }
