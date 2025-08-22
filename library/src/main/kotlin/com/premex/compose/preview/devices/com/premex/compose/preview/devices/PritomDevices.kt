package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * pritom device specifications for Android Compose previews.
 *
 * This extension provides pritom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pritom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pritom: Any
  get() = object {
      /** DeviceSpec(manufacturer=pritom, code=L8_B03, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=pritom, code=L8_B03, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_B03 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
