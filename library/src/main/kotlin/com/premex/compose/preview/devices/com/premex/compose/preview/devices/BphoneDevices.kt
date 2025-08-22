package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bphone device specifications for Android Compose previews.
 *
 * This extension provides Bphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bphone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bphone, code=B2017, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bphone, code=B2017, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val B2017 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Bphone, code=Bphone_A85_5G, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bphone, code=Bphone_A85_5G,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val BPHONE_A85_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Bphone, code=Bphone_A_Series, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bphone, code=Bphone_A_Series,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val BPHONE_A_SERIES = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Bphone, code=Bphone_B86, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bphone, code=Bphone_B86,
      width=1080, height=2220, dpi=440, isGoogleDevice=false).code */
      val BPHONE_B86 = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
