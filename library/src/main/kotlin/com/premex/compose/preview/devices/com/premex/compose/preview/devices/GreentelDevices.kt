package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * greentel device specifications for Android Compose previews.
 *
 * This extension provides greentel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Greentel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Greentel: Any
  get() = object {
      /** DeviceSpec(manufacturer=greentel, code=Tab-X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=greentel, code=Tab-X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_X = "spec:width=800,height=1280,unit=px,dpi=213"

  }
