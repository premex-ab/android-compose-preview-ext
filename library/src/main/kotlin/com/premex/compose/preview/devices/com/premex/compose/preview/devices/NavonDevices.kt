package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Navon device specifications for Android Compose previews.
 *
 * This extension provides Navon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Navon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Navon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Navon, code=Infinity, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Infinity, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val INFINITY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Navon, code=iQ7_2018, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=iQ7_2018, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val IQ7_2018 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Navon, code=Navon_IQ8_2021, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Navon_IQ8_2021,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NAVON_IQ8_2021 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Navon, code=Navon_SPT1100, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Navon_SPT1100,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val NAVON_SPT1100 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Navon, code=Platinum103G2019, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Platinum103G2019,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PLATINUM103G2019 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Navon, code=Platinum_10_3G_V2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Platinum_10_3G_V2,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PLATINUM_10_3G_V2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Navon, code=Pure_Micro, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Pure_Micro, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PURE_MICRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Navon, code=Sky, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Sky, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SKY = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Navon, code=Spirit, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Spirit, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SPIRIT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Navon, code=Spirit_Plus, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Navon, code=Spirit_Plus, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SPIRIT_PLUS = "spec:width=640,height=1280,unit=px,dpi=320"

  }
