package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PIONEER_DIGITAL_TV device specifications for Android Compose previews.
 *
 * This extension provides PIONEER_DIGITAL_TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PIONEERDIGITALTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PIONEERDIGITALTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=PIONEER_DIGITAL_TV, code=SEI900PD, width=1080, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIONEER_DIGITAL_TV,
      code=SEI900PD, width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI900PD = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
