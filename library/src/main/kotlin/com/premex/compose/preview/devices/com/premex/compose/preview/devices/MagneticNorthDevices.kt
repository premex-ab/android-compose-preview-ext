package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MagneticNorth device specifications for Android Compose previews.
 *
 * This extension provides MagneticNorth device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MagneticNorth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MagneticNorth: Any
  get() = object {
      /** DeviceSpec(manufacturer=MagneticNorth, code=Multiple_Applications_Display_Terminal,
      width=600, height=1024, dpi=182, isGoogleDevice=false).manufacturer
      DeviceSpec(manufacturer=MagneticNorth, code=Multiple_Applications_Display_Terminal, width=600,
      height=1024, dpi=182, isGoogleDevice=false).code */
      val MULTIPLE_APPLICATIONS_DISPLAY_TERMINAL = "spec:width=600,height=1024,unit=px,dpi=182"

  }
