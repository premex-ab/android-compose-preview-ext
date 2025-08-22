package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AQHH device specifications for Android Compose previews.
 *
 * This extension provides AQHH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AQHH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AQHH: Any
  get() = object {
      /** DeviceSpec(manufacturer=AQHH, code=A75, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AQHH, code=A75, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val A75 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
