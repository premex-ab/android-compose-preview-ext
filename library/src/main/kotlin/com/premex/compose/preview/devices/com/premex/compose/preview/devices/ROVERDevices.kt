package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ROVER device specifications for Android Compose previews.
 *
 * This extension provides ROVER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ROVER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ROVER: Any
  get() = object {
      /** DeviceSpec(manufacturer=ROVER, code=CHIPPY, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ROVER, code=CHIPPY, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val CHIPPY = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ROVER, code=R10_M, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ROVER, code=R10_M, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val R10_M = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=ROVER, code=R8, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ROVER, code=R8, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val R8 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
