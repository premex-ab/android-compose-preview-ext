package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Speedata device specifications for Android Compose previews.
 *
 * This extension provides Speedata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Speedata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Speedata: Any
  get() = object {
      /** DeviceSpec(manufacturer=Speedata, code=SD100, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Speedata, code=SD100, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SD100 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
