package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Masscom device specifications for Android Compose previews.
 *
 * This extension provides Masscom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Masscom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Masscom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Masscom, code=Masstel_X1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masscom, code=Masstel_X1,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MASSTEL_X1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masscom, code=Masstel_X3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masscom, code=Masstel_X3,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MASSTEL_X3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Masscom, code=Masstel_X5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Masscom, code=Masstel_X5,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MASSTEL_X5 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
