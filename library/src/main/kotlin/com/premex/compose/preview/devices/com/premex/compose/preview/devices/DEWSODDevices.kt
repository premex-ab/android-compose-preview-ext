package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DEWSOD device specifications for Android Compose previews.
 *
 * This extension provides DEWSOD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DEWSOD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DEWSOD: Any
  get() = object {
      /** DeviceSpec(manufacturer=DEWSOD, code=C9, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEWSOD, code=C9, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val C9 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
