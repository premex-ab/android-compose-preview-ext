package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Urovo device specifications for Android Compose previews.
 *
 * This extension provides Urovo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Urovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Urovo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Urovo, code=DT40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=DT40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val DT40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Urovo, code=DT50, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=DT50, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DT50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Urovo, code=i6310, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=i6310, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I6310 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Urovo, code=i9000S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=i9000S, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I9000S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Urovo, code=P8100, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=P8100, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P8100 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Urovo, code=P8100P, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=P8100P, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P8100P = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Urovo, code=RT40S, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=RT40S, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RT40S = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Urovo, code=SQ46M, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=SQ46M, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val SQ46M = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Urovo, code=SQ47, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Urovo, code=SQ47, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SQ47 = "spec:width=480,height=800,unit=px,dpi=240"

  }
