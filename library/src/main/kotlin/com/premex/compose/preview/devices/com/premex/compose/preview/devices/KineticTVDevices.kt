package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KineticTV device specifications for Android Compose previews.
 *
 * This extension provides KineticTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KineticTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KineticTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=KineticTV, code=DV8219, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KineticTV, code=DV8219, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
