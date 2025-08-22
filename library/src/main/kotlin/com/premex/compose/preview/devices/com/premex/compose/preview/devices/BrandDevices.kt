package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * brand device specifications for Android Compose previews.
 *
 * This extension provides brand device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brand: Any
  get() = object {
      /** DeviceSpec(manufacturer=brand, code=device, width=600, height=1024, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=brand, code=device, width=600,
      height=1024, dpi=190, isGoogleDevice=false).code */
      val DEVICE = "spec:width=600,height=1024,unit=px,dpi=190"

  }
