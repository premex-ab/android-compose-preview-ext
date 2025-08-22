package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPRANGE device specifications for Android Compose previews.
 *
 * This extension provides SPRANGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SPRANGE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPRANGE: Any
  get() = object {
      /** DeviceSpec(manufacturer=SPRANGE, code=Sprange_L8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPRANGE, code=Sprange_L8,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SPRANGE_L8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
