package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIZIO device specifications for Android Compose previews.
 *
 * This extension provides VIZIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIZIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIZIO: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIZIO, code=XR6M10, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIZIO, code=XR6M10, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val XR6M10 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VIZIO, code=XR6P10, width=1080, height=1920, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIZIO, code=XR6P10, width=1080,
      height=1920, dpi=400, isGoogleDevice=false).code */
      val XR6P10 = "spec:width=1080,height=1920,unit=px,dpi=400"

  }
