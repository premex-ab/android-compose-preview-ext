package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AdvantageAir device specifications for Android Compose previews.
 *
 * This extension provides AdvantageAir device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AdvantageAir.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AdvantageAir: Any
  get() = object {
      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC10GS10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC10GS10,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PIC10GS10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC10GS13, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC10GS13,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val PIC10GS13 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC10GS8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC10GS8,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PIC10GS8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC7GS10-A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC7GS10-A,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIC7GS10_A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC7GS13, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC7GS13,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIC7GS13 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC7GS8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC7GS8,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIC7GS8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC8GS10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC8GS10,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PIC8GS10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC8GS12, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC8GS12,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val PIC8GS12 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=AdvantageAir, code=PIC8GS8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AdvantageAir, code=PIC8GS8,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val PIC8GS8 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
