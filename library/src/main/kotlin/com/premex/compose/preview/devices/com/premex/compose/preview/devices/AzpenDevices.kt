package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * azpen device specifications for Android Compose previews.
 *
 * This extension provides azpen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Azpen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Azpen: Any
  get() = object {
      /** DeviceSpec(manufacturer=azpen, code=A1083, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=azpen, code=A1083, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val A1083 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=azpen, code=C-603, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=azpen, code=C-603, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C_603 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
