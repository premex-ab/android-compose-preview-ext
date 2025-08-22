package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HotPepper device specifications for Android Compose previews.
 *
 * This extension provides HotPepper device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HotPepper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HotPepper: Any
  get() = object {
      /** DeviceSpec(manufacturer=HotPepper, code=DT10_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=DT10_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val DT10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HotPepper, code=HPPAP16, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=HPPAP16, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HPPAP16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HotPepper, code=HPPL60A, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=HPPL60A, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val HPPL60A = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HotPepper, code=HPPL63A, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=HPPL63A, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val HPPL63A = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HotPepper, code=HPP-GS1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=HPP-GS1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HPP_GS1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HotPepper, code=HPP-L55B, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=HPP-L55B,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HPP_L55B = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HotPepper, code=K82A, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=K82A, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val K82A = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HotPepper, code=KR10, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=KR10, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val KR10 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HotPepper, code=KT10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=KT10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KT10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HotPepper, code=Stylo_7plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=Stylo_7plus,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val STYLO_7PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HotPepper, code=VLE5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=VLE5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VLE5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HotPepper, code=15_Pro_Max, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotPepper, code=15_Pro_Max,
      width=720, height=1650, dpi=320, isGoogleDevice=false).code */
      val _15_PRO_MAX = "spec:width=720,height=1650,unit=px,dpi=320"

  }
