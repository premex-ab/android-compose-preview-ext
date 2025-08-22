package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PIXART device specifications for Android Compose previews.
 *
 * This extension provides PIXART device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PIXART.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PIXART: Any
  get() = object {
      /** DeviceSpec(manufacturer=PIXART, code=Pixart_P20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIXART, code=Pixart_P20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXART_P20 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
