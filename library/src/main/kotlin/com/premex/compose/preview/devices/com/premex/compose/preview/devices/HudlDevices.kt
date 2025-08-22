package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hudl device specifications for Android Compose previews.
 *
 * This extension provides Hudl device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hudl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hudl: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hudl, code=HTF8A4, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hudl, code=HTF8A4, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HTF8A4 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
