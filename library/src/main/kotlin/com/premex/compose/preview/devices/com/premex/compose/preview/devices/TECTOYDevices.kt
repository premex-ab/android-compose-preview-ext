package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECTOY device specifications for Android Compose previews.
 *
 * This extension provides TECTOY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECTOY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECTOY: Any
  get() = object {
      /** DeviceSpec(manufacturer=TECTOY, code=TokyoPro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECTOY, code=TokyoPro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TOKYOPRO = "spec:width=720,height=1520,unit=px,dpi=320"

  }
