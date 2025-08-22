package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALT device specifications for Android Compose previews.
 *
 * This extension provides ALT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALT: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALT, code=odin, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALT, code=odin, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ODIN = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALT, code=odin2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALT, code=odin2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ODIN2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALT, code=thor, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALT, code=thor, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val THOR = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALT, code=thor2, width=480, height=800, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALT, code=thor2, width=480,
      height=800, dpi=220, isGoogleDevice=false).code */
      val THOR2 = "spec:width=480,height=800,unit=px,dpi=220"

  }
