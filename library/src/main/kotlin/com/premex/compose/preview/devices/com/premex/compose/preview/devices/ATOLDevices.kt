package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATOL device specifications for Android Compose previews.
 *
 * This extension provides ATOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATOL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATOL: Any
  get() = object {
      /** DeviceSpec(manufacturer=ATOL, code=t150, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOL, code=t150, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val T150 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ATOL, code=t50p, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOL, code=t50p, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val T50P = "spec:width=480,height=800,unit=px,dpi=240"

  }
