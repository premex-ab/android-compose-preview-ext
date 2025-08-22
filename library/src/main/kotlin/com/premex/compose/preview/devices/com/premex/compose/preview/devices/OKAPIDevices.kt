package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OKAPI device specifications for Android Compose previews.
 *
 * This extension provides OKAPI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OKAPI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OKAPI: Any
  get() = object {
      /** DeviceSpec(manufacturer=OKAPI, code=Okapi10, width=480, height=996, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OKAPI, code=Okapi10, width=480,
      height=996, dpi=213, isGoogleDevice=false).code */
      val OKAPI10 = "spec:width=480,height=996,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OKAPI, code=Okapi10_Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OKAPI, code=Okapi10_Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val OKAPI10_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OKAPI, code=Okapi10_Pro_Max, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OKAPI, code=Okapi10_Pro_Max,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val OKAPI10_PRO_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OKAPI, code=Okapi10_S, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OKAPI, code=Okapi10_S, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val OKAPI10_S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OKAPI, code=Okapi_Tab8, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OKAPI, code=Okapi_Tab8, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val OKAPI_TAB8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OKAPI, code=Okapi_Tab8_Pro, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OKAPI, code=Okapi_Tab8_Pro,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val OKAPI_TAB8_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

  }
