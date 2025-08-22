package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FOSSiBOT device specifications for Android Compose previews.
 *
 * This extension provides FOSSiBOT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FOSSiBOT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FOSSiBOT: Any
  get() = object {
      /** DeviceSpec(manufacturer=FOSSiBOT, code=DT1_Lite, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=DT1_Lite,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val DT1_LITE = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=DT2, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=DT2, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val DT2 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F101, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F101, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val F101 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F101_P, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F101_P, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val F101_P = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F101_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F101_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val F101_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F102, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F102, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val F102 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F105, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F105, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val F105 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F106_Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F106_Pro,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val F106_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F109, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F109, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val F109 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F109_S, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F109_S, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val F109_S = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=F112_Pro, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=F112_Pro, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val F112_PRO = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=FOSSiBOT_S2, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=FOSSiBOT_S2,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val FOSSIBOT_S2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=S1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=S1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=S3_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=S3_Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val S3_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FOSSiBOT, code=Tab_12, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOSSiBOT, code=Tab_12, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB_12 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
