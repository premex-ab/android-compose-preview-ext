package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FFF device specifications for Android Compose previews.
 *
 * This extension provides FFF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FFF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FFF: Any
  get() = object {
      /** DeviceSpec(manufacturer=FFF, code=F3T10WD4, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FFF, code=F3T10WD4, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val F3T10WD4 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
