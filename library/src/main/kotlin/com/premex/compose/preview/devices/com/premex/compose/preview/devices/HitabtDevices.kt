package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * hitabt device specifications for Android Compose previews.
 *
 * This extension provides hitabt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hitabt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hitabt: Any
  get() = object {
      /** DeviceSpec(manufacturer=hitabt, code=K30A, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hitabt, code=K30A, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val K30A = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=hitabt, code=P30A, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hitabt, code=P30A, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val P30A = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=hitabt, code=T30A_SY07PC01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hitabt, code=T30A_SY07PC01,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val T30A_SY07PC01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
