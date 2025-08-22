package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FMC device specifications for Android Compose previews.
 *
 * This extension provides FMC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FMC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FMC: Any
  get() = object {
      /** DeviceSpec(manufacturer=FMC, code=belford, width=1080, height=2348, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FMC, code=belford, width=1080,
      height=2348, dpi=200, isGoogleDevice=false).code */
      val BELFORD = "spec:width=1080,height=2348,unit=px,dpi=200"

  }
