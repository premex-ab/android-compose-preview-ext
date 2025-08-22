package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ROLLCALL device specifications for Android Compose previews.
 *
 * This extension provides ROLLCALL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ROLLCALL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ROLLCALL: Any
  get() = object {
      /** DeviceSpec(manufacturer=ROLLCALL, code=DT, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ROLLCALL, code=DT, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val DT = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
