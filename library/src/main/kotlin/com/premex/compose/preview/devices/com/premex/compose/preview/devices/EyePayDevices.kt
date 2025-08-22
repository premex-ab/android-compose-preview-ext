package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EyePay device specifications for Android Compose previews.
 *
 * This extension provides EyePay device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EyePay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EyePay: Any
  get() = object {
      /** DeviceSpec(manufacturer=EyePay, code=IG-EP100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EyePay, code=IG-EP100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IG_EP100 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
