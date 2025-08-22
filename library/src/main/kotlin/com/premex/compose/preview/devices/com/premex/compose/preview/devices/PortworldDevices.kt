package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Portworld device specifications for Android Compose previews.
 *
 * This extension provides Portworld device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Portworld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Portworld: Any
  get() = object {
      /** DeviceSpec(manufacturer=Portworld, code=YC-M10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Portworld, code=YC-M10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val YC_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
