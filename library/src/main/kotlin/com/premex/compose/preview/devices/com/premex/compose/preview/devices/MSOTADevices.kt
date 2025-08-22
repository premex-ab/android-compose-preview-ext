package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MSOTA device specifications for Android Compose previews.
 *
 * This extension provides MSOTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MSOTA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MSOTA: Any
  get() = object {
      /** DeviceSpec(manufacturer=MSOTA, code=Nobby_S500, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MSOTA, code=Nobby_S500, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NOBBY_S500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MSOTA, code=Nobby_X800, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MSOTA, code=Nobby_X800, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NOBBY_X800 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
