package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNCONNECTION device specifications for Android Compose previews.
 *
 * This extension provides SUNCONNECTION device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNCONNECTION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNCONNECTION: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUNCONNECTION, code=SUNTB_01_GY, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNCONNECTION, code=SUNTB_01_GY,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNTB_01_GY = "spec:width=800,height=1280,unit=px,dpi=213"

  }
