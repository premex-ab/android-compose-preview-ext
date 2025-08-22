package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MNC_NOW device specifications for Android Compose previews.
 *
 * This extension provides MNC_NOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MNCNOW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MNCNOW: Any
  get() = object {
      /** DeviceSpec(manufacturer=MNC_NOW, code=HP40A3, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MNC_NOW, code=HP40A3, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HP40A3 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
