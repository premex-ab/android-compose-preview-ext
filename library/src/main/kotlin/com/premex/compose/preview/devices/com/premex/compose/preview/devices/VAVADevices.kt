package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VAVA device specifications for Android Compose previews.
 *
 * This extension provides VAVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VAVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VAVA: Any
  get() = object {
      /** DeviceSpec(manufacturer=VAVA, code=V1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VAVA, code=V1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VAVA, code=V2, width=540, height=1080, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VAVA, code=V2, width=540,
      height=1080, dpi=240, isGoogleDevice=false).code */
      val V2 = "spec:width=540,height=1080,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VAVA, code=XP3, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VAVA, code=XP3, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XP3 = "spec:width=640,height=1280,unit=px,dpi=320"

  }
