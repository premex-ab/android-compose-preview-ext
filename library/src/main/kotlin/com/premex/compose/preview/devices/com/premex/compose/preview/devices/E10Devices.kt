package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * e10 device specifications for Android Compose previews.
 *
 * This extension provides e10 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.E10.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.E10: Any
  get() = object {
      /** DeviceSpec(manufacturer=e10, code=ETPad, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=e10, code=ETPad, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val ETPAD = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
