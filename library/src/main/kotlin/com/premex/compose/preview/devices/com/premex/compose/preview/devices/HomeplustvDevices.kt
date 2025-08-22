package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Homeplustv device specifications for Android Compose previews.
 *
 * This extension provides Homeplustv device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Homeplustv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Homeplustv: Any
  get() = object {
      /** DeviceSpec(manufacturer=Homeplustv, code=HCA6010, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homeplustv, code=HCA6010,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HCA6010 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Homeplustv, code=STB6252C, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homeplustv, code=STB6252C,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val STB6252C = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Homeplustv, code=vsb3918_apac, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homeplustv, code=vsb3918_apac,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val VSB3918_APAC = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
