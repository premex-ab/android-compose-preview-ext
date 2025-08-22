package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * E-LEAD device specifications for Android Compose previews.
 *
 * This extension provides E-LEAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ELEAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ELEAD: Any
  get() = object {
      /** DeviceSpec(manufacturer=E-LEAD, code=RSE, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=E-LEAD, code=RSE, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val RSE = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
