package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TRUFON device specifications for Android Compose previews.
 *
 * This extension provides TRUFON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TRUFON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TRUFON: Any
  get() = object {
      /** DeviceSpec(manufacturer=TRUFON, code=TRUFON_FLEX, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUFON, code=TRUFON_FLEX,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val TRUFON_FLEX = "spec:width=720,height=1600,unit=px,dpi=280"

  }
