package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * M3 device specifications for Android Compose previews.
 *
 * This extension provides M3 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.M3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.M3: Any
  get() = object {
      /** DeviceSpec(manufacturer=M3, code=M3SL20, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3SL20, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M3SL20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=M3, code=M3SL20K, width=480, height=800, dpi=202,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3SL20K, width=480,
      height=800, dpi=202, isGoogleDevice=false).code */
      val M3SL20K = "spec:width=480,height=800,unit=px,dpi=202"

      /** DeviceSpec(manufacturer=M3, code=M3SL20PLUS, width=720, height=1440, dpi=202,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3SL20PLUS, width=720,
      height=1440, dpi=202, isGoogleDevice=false).code */
      val M3SL20PLUS = "spec:width=720,height=1440,unit=px,dpi=202"

      /** DeviceSpec(manufacturer=M3, code=M3SM15N, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3SM15N, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M3SM15N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=M3, code=M3SM15X, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3SM15X, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val M3SM15X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=M3, code=M3SM20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3SM20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M3SM20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=M3, code=M3UL20F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3UL20F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val M3UL20F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=M3, code=M3UL20W, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3UL20W, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val M3UL20W = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=M3, code=M3UL20X, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3UL20X, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val M3UL20X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=M3, code=M3US20W, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3US20W, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val M3US20W = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=M3, code=M3US20X, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3US20X, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val M3US20X = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=M3, code=M3-SL10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M3, code=M3-SL10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M3_SL10 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
