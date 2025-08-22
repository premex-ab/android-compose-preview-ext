package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vios device specifications for Android Compose previews.
 *
 * This extension provides Vios device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vios.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vios: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vios, code=65PB1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vios, code=65PB1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val _65PB1 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
