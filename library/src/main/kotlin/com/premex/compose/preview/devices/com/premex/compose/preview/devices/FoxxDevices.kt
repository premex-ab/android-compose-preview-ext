package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Foxx device specifications for Android Compose previews.
 *
 * This extension provides Foxx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Foxx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Foxx: Any
  get() = object {
      /** DeviceSpec(manufacturer=Foxx, code=A55AM, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Foxx, code=A55AM, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val A55AM = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Foxx, code=V8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Foxx, code=V8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val V8 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
