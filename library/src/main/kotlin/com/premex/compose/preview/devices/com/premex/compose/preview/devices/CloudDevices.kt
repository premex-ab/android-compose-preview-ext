package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cloud device specifications for Android Compose previews.
 *
 * This extension provides Cloud device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cloud.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cloud: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cloud, code=Cyclone_C4, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud, code=Cyclone_C4, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CYCLONE_C4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cloud, code=Storm_C3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud, code=Storm_C3, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STORM_C3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cloud, code=Stratus_C5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud, code=Stratus_C5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val STRATUS_C5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cloud, code=Stratus_C5_Elite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud, code=Stratus_C5_Elite,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val STRATUS_C5_ELITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cloud, code=Sunshine_T1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud, code=Sunshine_T1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNSHINE_T1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Cloud, code=Sunshine_T1_Elite, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud, code=Sunshine_T1_Elite,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNSHINE_T1_ELITE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Cloud, code=Typhoon_C6, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud, code=Typhoon_C6, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TYPHOON_C6 = "spec:width=540,height=960,unit=px,dpi=240"

  }
