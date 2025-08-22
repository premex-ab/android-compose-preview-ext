package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * geaneepro device specifications for Android Compose previews.
 *
 * This extension provides geaneepro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geaneepro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geaneepro: Any
  get() = object {
      /** DeviceSpec(manufacturer=geaneepro, code=JT07-90, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=geaneepro, code=JT07-90, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val JT07_90 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=geaneepro, code=JT10-90, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=geaneepro, code=JT10-90, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JT10_90 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
