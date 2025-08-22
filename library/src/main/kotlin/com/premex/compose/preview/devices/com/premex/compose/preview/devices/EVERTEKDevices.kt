package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVERTEK device specifications for Android Compose previews.
 *
 * This extension provides EVERTEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVERTEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVERTEK: Any
  get() = object {
      /** DeviceSpec(manufacturer=EVERTEK, code=E7224HG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=E7224HG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val E7224HG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EVERTEK, code=E8224HG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=E8224HG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E8224HG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EVERTEK, code=EVERTEK_M10_Max, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=EVERTEK_M10_Max,
      width=600, height=1280, dpi=280, isGoogleDevice=false).code */
      val EVERTEK_M10_MAX = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EVERTEK, code=EVERTEK_M20S_Mini, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=EVERTEK_M20S_Mini,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val EVERTEK_M20S_MINI = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERTEK, code=M20_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=M20_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val M20_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVERTEK, code=P17, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=P17, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P17 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EVERTEK, code=P17_Pro, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=P17_Pro, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P17_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EVERTEK, code=P18_Pro, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=P18_Pro, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P18_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERTEK, code=V4, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=V4, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERTEK, code=V4_Nano, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=V4_Nano, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val V4_NANO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERTEK, code=V5_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=V5_Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERTEK, code=V8, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=V8, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V8 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EVERTEK, code=V9_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERTEK, code=V9_Plus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V9_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

  }
