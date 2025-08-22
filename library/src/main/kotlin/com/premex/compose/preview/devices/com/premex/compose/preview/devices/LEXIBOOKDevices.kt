package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LEXIBOOK device specifications for Android Compose previews.
 *
 * This extension provides LEXIBOOK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LEXIBOOK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LEXIBOOK: Any
  get() = object {
      /** DeviceSpec(manufacturer=LEXIBOOK, code=LT10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEXIBOOK, code=LT10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LT10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LEXIBOOK, code=LT10EN_09, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEXIBOOK, code=LT10EN_09,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val LT10EN_09 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LEXIBOOK, code=LT10_01_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEXIBOOK, code=LT10_01_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val LT10_01_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LEXIBOOK, code=MFS100, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEXIBOOK, code=MFS100, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MFS100 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LEXIBOOK, code=TL70, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEXIBOOK, code=TL70, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TL70 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LEXIBOOK, code=TLN10FR, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LEXIBOOK, code=TLN10FR, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TLN10FR = "spec:width=800,height=1280,unit=px,dpi=213"

  }
