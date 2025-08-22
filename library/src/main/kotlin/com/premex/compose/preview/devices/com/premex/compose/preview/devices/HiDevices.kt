package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hi device specifications for Android Compose previews.
 *
 * This extension provides Hi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hi, code=Boost_Max, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hi, code=Boost_Max, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val BOOST_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hi, code=Boost_Ultra, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hi, code=Boost_Ultra, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BOOST_ULTRA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hi, code=HMR5012, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hi, code=HMR5012, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HMR5012 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hi, code=HMR5450, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hi, code=HMR5450, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val HMR5450 = "spec:width=480,height=960,unit=px,dpi=240"

  }
