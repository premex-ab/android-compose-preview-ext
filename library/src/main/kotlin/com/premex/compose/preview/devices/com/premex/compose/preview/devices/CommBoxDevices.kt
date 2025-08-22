package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CommBox device specifications for Android Compose previews.
 *
 * This extension provides CommBox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CommBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CommBox: Any
  get() = object {
      /** DeviceSpec(manufacturer=CommBox, code=rk3576_u, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CommBox, code=rk3576_u, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RK3576_U = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
