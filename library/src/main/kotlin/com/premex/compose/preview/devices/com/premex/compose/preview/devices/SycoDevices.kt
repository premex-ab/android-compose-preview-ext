package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Syco device specifications for Android Compose previews.
 *
 * This extension provides Syco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Syco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Syco: Any
  get() = object {
      /** DeviceSpec(manufacturer=Syco, code=RS-403, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Syco, code=RS-403, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RS_403 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
