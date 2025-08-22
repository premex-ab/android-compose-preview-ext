package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * chainway device specifications for Android Compose previews.
 *
 * This extension provides chainway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chainway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chainway: Any
  get() = object {
      /** DeviceSpec(manufacturer=chainway, code=C6000, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=chainway, code=C6000, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val C6000 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=chainway, code=C90, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=chainway, code=C90, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C90 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
