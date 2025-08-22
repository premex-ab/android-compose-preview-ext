package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EDSTAR device specifications for Android Compose previews.
 *
 * This extension provides EDSTAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EDSTAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EDSTAR: Any
  get() = object {
      /** DeviceSpec(manufacturer=EDSTAR, code=LC-TS08S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EDSTAR, code=LC-TS08S, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LC_TS08S = "spec:width=800,height=1280,unit=px,dpi=213"

  }
