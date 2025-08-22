package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KrossElegance device specifications for Android Compose previews.
 *
 * This extension provides KrossElegance device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KrossElegance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KrossElegance: Any
  get() = object {
      /** DeviceSpec(manufacturer=KrossElegance, code=KE-TB1032OF, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KrossElegance, code=KE-TB1032OF,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val KE_TB1032OF = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=KrossElegance, code=KE-TB816OF, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KrossElegance, code=KE-TB816OF,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KE_TB816OF = "spec:width=800,height=1280,unit=px,dpi=213"

  }
