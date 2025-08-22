package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Selvas device specifications for Android Compose previews.
 *
 * This extension provides Selvas device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Selvas.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Selvas: Any
  get() = object {
      /** DeviceSpec(manufacturer=Selvas, code=polaris, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Selvas, code=polaris, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val POLARIS = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
