package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Revomovil device specifications for Android Compose previews.
 *
 * This extension provides Revomovil device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Revomovil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Revomovil: Any
  get() = object {
      /** DeviceSpec(manufacturer=Revomovil, code=S6523_RU, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Revomovil, code=S6523_RU,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val S6523_RU = "spec:width=720,height=1600,unit=px,dpi=320"

  }
