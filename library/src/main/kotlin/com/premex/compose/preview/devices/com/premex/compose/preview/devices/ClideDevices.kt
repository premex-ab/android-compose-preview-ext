package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Clide device specifications for Android Compose previews.
 *
 * This extension provides Clide device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clide.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clide: Any
  get() = object {
      /** DeviceSpec(manufacturer=Clide, code=A10A, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clide, code=A10A, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val A10A = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Clide, code=A10B, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clide, code=A10B, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val A10B = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
