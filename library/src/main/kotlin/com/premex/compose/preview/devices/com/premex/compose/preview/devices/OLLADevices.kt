package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OLLA device specifications for Android Compose previews.
 *
 * This extension provides OLLA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OLLA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OLLA: Any
  get() = object {
      /** DeviceSpec(manufacturer=OLLA, code=M5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLLA, code=M5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OLLA, code=M6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLLA, code=M6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OLLA, code=M8, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLLA, code=M8, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val M8 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OLLA, code=Note3, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLLA, code=Note3, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NOTE3 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
