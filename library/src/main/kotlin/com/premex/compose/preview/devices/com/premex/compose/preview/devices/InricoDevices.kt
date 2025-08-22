package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Inrico device specifications for Android Compose previews.
 *
 * This extension provides Inrico device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inrico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inrico: Any
  get() = object {
      /** DeviceSpec(manufacturer=Inrico, code=S300Plus, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Inrico, code=S300Plus, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val S300PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Inrico, code=S350, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Inrico, code=S350, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S350 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
