package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VILLAON device specifications for Android Compose previews.
 *
 * This extension provides VILLAON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VILLAON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VILLAON: Any
  get() = object {
      /** DeviceSpec(manufacturer=VILLAON, code=V20, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VILLAON, code=V20, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val V20 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=VILLAON, code=VILLAON_V20_SE, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VILLAON, code=VILLAON_V20_SE,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val VILLAON_V20_SE = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=VILLAON, code=VILLAON-V30, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VILLAON, code=VILLAON-V30,
      width=540, height=1200, dpi=240, isGoogleDevice=false).code */
      val VILLAON_V30 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VILLAON, code=VILLAON-V30-RS, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VILLAON, code=VILLAON-V30-RS,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val VILLAON_V30_RS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VILLAON, code=VILLAON-V40, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VILLAON, code=VILLAON-V40,
      width=576, height=1280, dpi=240, isGoogleDevice=false).code */
      val VILLAON_V40 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VILLAON, code=VILLAON-V40s, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VILLAON, code=VILLAON-V40s,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val VILLAON_V40S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VILLAON, code=VILLAON-V652L, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VILLAON, code=VILLAON-V652L,
      width=576, height=1280, dpi=240, isGoogleDevice=false).code */
      val VILLAON_V652L = "spec:width=576,height=1280,unit=px,dpi=240"

  }
