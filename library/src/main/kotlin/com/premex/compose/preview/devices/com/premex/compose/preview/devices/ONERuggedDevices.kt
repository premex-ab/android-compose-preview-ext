package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ONERugged device specifications for Android Compose previews.
 *
 * This extension provides ONERugged device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ONERugged.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ONERugged: Any
  get() = object {
      /** DeviceSpec(manufacturer=ONERugged, code=M185QE, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONERugged, code=M185QE, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M185QE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ONERugged, code=M86XE, width=1200, height=1920, dpi=321,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONERugged, code=M86XE, width=1200,
      height=1920, dpi=321, isGoogleDevice=false).code */
      val M86XE = "spec:width=1200,height=1920,unit=px,dpi=321"

      /** DeviceSpec(manufacturer=ONERugged, code=MP1T, width=720, height=1612, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONERugged, code=MP1T, width=720,
      height=1612, dpi=360, isGoogleDevice=false).code */
      val MP1T = "spec:width=720,height=1612,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=ONERugged, code=MPC80T, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONERugged, code=MPC80T, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MPC80T = "spec:width=800,height=1280,unit=px,dpi=213"

  }
