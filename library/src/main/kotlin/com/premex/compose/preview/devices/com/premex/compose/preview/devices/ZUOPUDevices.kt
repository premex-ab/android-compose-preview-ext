package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZUOPU device specifications for Android Compose previews.
 *
 * This extension provides ZUOPU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZUOPU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZUOPU: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZUOPU, code=JH101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUOPU, code=JH101, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val JH101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZUOPU, code=JH103, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUOPU, code=JH103, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val JH103 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZUOPU, code=JH105, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUOPU, code=JH105, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val JH105 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZUOPU, code=JH863, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUOPU, code=JH863, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val JH863 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
