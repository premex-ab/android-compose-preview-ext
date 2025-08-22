package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELOSYSTEMS device specifications for Android Compose previews.
 *
 * This extension provides TELOSYSTEMS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TELOSYSTEMS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TELOSYSTEMS: Any
  get() = object {
      /** DeviceSpec(manufacturer=TELOSYSTEMS, code=TE590P_E, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELOSYSTEMS, code=TE590P_E,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val TE590P_E = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TELOSYSTEMS, code=TE590P_O, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELOSYSTEMS, code=TE590P_O,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val TE590P_O = "spec:width=480,height=800,unit=px,dpi=240"

  }
