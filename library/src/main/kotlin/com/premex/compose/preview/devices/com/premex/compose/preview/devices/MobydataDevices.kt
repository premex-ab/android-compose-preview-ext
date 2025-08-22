package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mobydata device specifications for Android Compose previews.
 *
 * This extension provides Mobydata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobydata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobydata: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mobydata, code=m63s, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobydata, code=m63s, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val M63S = "spec:width=480,height=800,unit=px,dpi=240"

  }
