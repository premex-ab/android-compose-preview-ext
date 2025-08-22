package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YES device specifications for Android Compose previews.
 *
 * This extension provides YES device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YES.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YES: Any
  get() = object {
      /** DeviceSpec(manufacturer=YES, code=Altitude_4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YES, code=Altitude_4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ALTITUDE_4 = "spec:width=480,height=960,unit=px,dpi=240"

  }
