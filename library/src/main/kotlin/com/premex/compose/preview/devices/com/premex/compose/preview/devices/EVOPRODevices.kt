package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVOPRO device specifications for Android Compose previews.
 *
 * This extension provides EVOPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVOPRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVOPRO: Any
  get() = object {
      /** DeviceSpec(manufacturer=EVOPRO, code=SEI500EV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVOPRO, code=SEI500EV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500EV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
