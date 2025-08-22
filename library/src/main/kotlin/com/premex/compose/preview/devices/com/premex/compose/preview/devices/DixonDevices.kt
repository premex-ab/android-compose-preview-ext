package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dixon device specifications for Android Compose previews.
 *
 * This extension provides Dixon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dixon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dixon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dixon, code=S5790, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dixon, code=S5790, width=720,
      height=1520, dpi=300, isGoogleDevice=false).code */
      val S5790 = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Dixon, code=TS_M103A, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dixon, code=TS_M103A, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TS_M103A = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
