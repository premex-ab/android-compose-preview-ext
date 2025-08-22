package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * verizon device specifications for Android Compose previews.
 *
 * This extension provides verizon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Verizon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Verizon: Any
  get() = object {
      /** DeviceSpec(manufacturer=verizon, code=D6708, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=verizon, code=D6708, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D6708 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=verizon, code=dorado, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=verizon, code=dorado, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val DORADO = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=verizon, code=SGP561, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=verizon, code=SGP561, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SGP561 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=verizon, code=stingray, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=verizon, code=stingray, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val STINGRAY = "spec:width=752,height=1280,unit=px,dpi=160"

  }
