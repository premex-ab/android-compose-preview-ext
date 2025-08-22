package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Doppio device specifications for Android Compose previews.
 *
 * This extension provides Doppio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Doppio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Doppio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Doppio, code=Doppio_SL558, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doppio, code=Doppio_SL558,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val DOPPIO_SL558 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doppio, code=U500, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doppio, code=U500, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val U500 = "spec:width=480,height=854,unit=px,dpi=240"

  }
