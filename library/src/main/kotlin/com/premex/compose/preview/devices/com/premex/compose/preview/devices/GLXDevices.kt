package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GLX device specifications for Android Compose previews.
 *
 * This extension provides GLX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GLX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GLX: Any
  get() = object {
      /** DeviceSpec(manufacturer=GLX, code=Shahin_IV, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GLX, code=Shahin_IV, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val SHAHIN_IV = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
