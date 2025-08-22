package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bittium device specifications for Android Compose previews.
 *
 * This extension provides Bittium device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bittium.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bittium: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bittium, code=craton, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bittium, code=craton, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val CRATON = "spec:width=1080,height=1920,unit=px,dpi=420"

  }
