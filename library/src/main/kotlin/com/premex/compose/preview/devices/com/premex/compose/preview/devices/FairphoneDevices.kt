package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fairphone device specifications for Android Compose previews.
 *
 * This extension provides Fairphone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fairphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fairphone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fairphone, code=FP2, width=1080, height=1920, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fairphone, code=FP2, width=1080,
      height=1920, dpi=440, isGoogleDevice=false).code */
      val FP2 = "spec:width=1080,height=1920,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Fairphone, code=FP3, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fairphone, code=FP3, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val FP3 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Fairphone, code=FP4, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fairphone, code=FP4, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val FP4 = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Fairphone, code=FP5, width=1224, height=2700, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fairphone, code=FP5, width=1224,
      height=2700, dpi=480, isGoogleDevice=false).code */
      val FP5 = "spec:width=1224,height=2700,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Fairphone, code=FP6, width=1116, height=2484, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fairphone, code=FP6, width=1116,
      height=2484, dpi=480, isGoogleDevice=false).code */
      val FP6 = "spec:width=1116,height=2484,unit=px,dpi=480"

  }
