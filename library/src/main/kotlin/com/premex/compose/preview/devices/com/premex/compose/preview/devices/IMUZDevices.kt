package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IMUZ device specifications for Android Compose previews.
 *
 * This extension provides IMUZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IMUZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IMUZ: Any
  get() = object {
      /** DeviceSpec(manufacturer=IMUZ, code=G10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IMUZ, code=G10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val G10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IMUZ, code=RA10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IMUZ, code=RA10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val RA10 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
