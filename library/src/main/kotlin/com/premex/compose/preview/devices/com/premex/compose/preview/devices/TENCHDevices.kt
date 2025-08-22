package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TENCH device specifications for Android Compose previews.
 *
 * This extension provides TENCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TENCH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TENCH: Any
  get() = object {
      /** DeviceSpec(manufacturer=TENCH, code=TAB_A10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TENCH, code=TAB_A10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_A10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
