package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * d_light device specifications for Android Compose previews.
 *
 * This extension provides d_light device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dlight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dlight: Any
  get() = object {
      /** DeviceSpec(manufacturer=d_light, code=M100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=d_light, code=M100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=d_light, code=M1000, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=d_light, code=M1000, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M1000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=d_light, code=M200, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=d_light, code=M200, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val M200 = "spec:width=480,height=854,unit=px,dpi=240"

  }
