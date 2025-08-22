package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MojaTV device specifications for Android Compose previews.
 *
 * This extension provides MojaTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MojaTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MojaTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=MojaTV, code=SEI530BHT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MojaTV, code=SEI530BHT, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI530BHT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
