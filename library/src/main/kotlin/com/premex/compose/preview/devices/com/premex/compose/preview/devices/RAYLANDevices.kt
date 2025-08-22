package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RAYLAN device specifications for Android Compose previews.
 *
 * This extension provides RAYLAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RAYLAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RAYLAN: Any
  get() = object {
      /** DeviceSpec(manufacturer=RAYLAN, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYLAN, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAYLAN, code=P5000, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYLAN, code=P5000, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P5000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAYLAN, code=PHOENIX_H1PLUS, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYLAN, code=PHOENIX_H1PLUS,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PHOENIX_H1PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RAYLAN, code=PHOENIX_N1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYLAN, code=PHOENIX_N1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PHOENIX_N1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAYLAN, code=RAYLAN_P20_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYLAN, code=RAYLAN_P20_Plus,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val RAYLAN_P20_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RAYLAN, code=XPOWER_P6000, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYLAN, code=XPOWER_P6000,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val XPOWER_P6000 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
