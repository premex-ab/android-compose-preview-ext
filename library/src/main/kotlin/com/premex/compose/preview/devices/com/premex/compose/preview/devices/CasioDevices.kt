package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Casio device specifications for Android Compose previews.
 *
 * This extension provides Casio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Casio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Casio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Casio, code=ET-L10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Casio, code=ET-L10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ET_L10 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
