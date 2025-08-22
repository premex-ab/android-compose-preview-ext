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
      /** Kruger_Matz DRIVE9 */
      val DRIVE9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Kruger_Matz DRIVE_6 */
      val DRIVE_6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Kruger_Matz DRIVE_6S */
      val DRIVE_6S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Kruger_Matz DRIVE_8 */
      val DRIVE_8 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Kruger_Matz EAGLE_1066 */
      val EAGLE_1066 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Kruger_Matz EAGLE_1067 */
      val EAGLE_1067 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Kruger_Matz EAGLE_1068 */
      val EAGLE_1068 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Kruger_Matz EAGLE_1069 */
      val EAGLE_1069 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Kruger_Matz EAGLE_1072 */
      val EAGLE_1072 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Kruger_Matz EAGLE_1073 */
      val EAGLE_1073 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Kruger_Matz Eagle_702 */
      val EAGLE_702 = "spec:width=720,height=1280,unit=px,dpi=300"

      /** Kruger_Matz Eagle_806 */
      val EAGLE_806 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Kruger_Matz EAGLE_961 */
      val EAGLE_961 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Kruger_Matz FLOW5PLUS */
      val FLOW5PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Kruger_Matz FLOW6Lite */
      val FLOW6LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Kruger_Matz FLOW7 */
      val FLOW7 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Kruger_Matz FLOW_11 */
      val FLOW_11 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Kruger_Matz FLOW_5 */
      val FLOW_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Kruger_Matz Flow_7S */
      val FLOW_7S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Kruger_Matz Flow_9 */
      val FLOW_9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Kruger_Matz KM0708 */
      val KM0708 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Kruger_Matz KM08061 */
      val KM08061 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Kruger_Matz KM0807 */
      val KM0807 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** Kruger_Matz KM0808 */
      val KM0808 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Kruger_Matz KM1008 */
      val KM1008 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Kruger_Matz KM1070 */
      val KM1070 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** Kruger_Matz KM1074 */
      val KM1074 = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** Kruger_Matz KM1075 */
      val KM1075 = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** Kruger_Matz KM1076 */
      val KM1076 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Kruger_Matz LIVE_11 */
      val LIVE_11 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Kruger_Matz LIVE_12 */
      val LIVE_12 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** Kruger_Matz LIVE_6plus */
      val LIVE_6PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Kruger_Matz LIVE_7 */
      val LIVE_7 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Kruger_Matz LIVE_7S */
      val LIVE_7S = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** Kruger_Matz Live_8 */
      val LIVE_8 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Kruger_Matz Live_9 */
      val LIVE_9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Kruger_Matz Live_9S */
      val LIVE_9S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Kruger_Matz MOVE8mini */
      val MOVE8MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** Kruger_Matz MOVE9 */
      val MOVE9 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Kruger_Matz MOVE_8_1 */
      val MOVE_8_1 = "spec:width=640,height=1280,unit=px,dpi=320"

  }
