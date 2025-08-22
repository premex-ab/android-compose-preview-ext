package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Transvision device specifications for Android Compose previews.
 *
 * This extension provides Transvision device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Transvision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Transvision: Any
  get() = object {
      /** DeviceSpec(manufacturer=Transvision, code=UHD_I56AD_TRV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Transvision, code=UHD_I56AD_TRV,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UHD_I56AD_TRV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Transvision, code=USB6_IR80, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Transvision, code=USB6_IR80,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val USB6_IR80 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
