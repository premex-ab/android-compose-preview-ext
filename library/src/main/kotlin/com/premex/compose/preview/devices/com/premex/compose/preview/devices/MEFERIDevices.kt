package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MEFERI device specifications for Android Compose previews.
 *
 * This extension provides MEFERI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MEFERI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MEFERI: Any
  get() = object {
      /** DeviceSpec(manufacturer=MEFERI, code=ME10, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEFERI, code=ME10, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val ME10 = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MEFERI, code=ME40K, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEFERI, code=ME40K, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val ME40K = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MEFERI, code=ME61, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEFERI, code=ME61, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ME61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEFERI, code=ME74, width=480, height=800, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEFERI, code=ME74, width=480,
      height=800, dpi=210, isGoogleDevice=false).code */
      val ME74 = "spec:width=480,height=800,unit=px,dpi=210"

  }
