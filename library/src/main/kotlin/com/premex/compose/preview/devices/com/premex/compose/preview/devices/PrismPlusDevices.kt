package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PrismPlus device specifications for Android Compose previews.
 *
 * This extension provides PrismPlus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PrismPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PrismPlus: Any
  get() = object {
      /** DeviceSpec(manufacturer=PrismPlus, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrismPlus, code=anaheim,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PrismPlus, code=eleonas, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrismPlus, code=eleonas,
      width=2160, height=3840, dpi=320, isGoogleDevice=false).code */
      val ELEONAS = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PrismPlus, code=sunnyvale, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrismPlus, code=sunnyvale,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PrismPlus, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrismPlus, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PrismPlus, code=SW4H_FF, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrismPlus, code=SW4H_FF,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PrismPlus, code=SW6H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrismPlus, code=SW6H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PrismPlus, code=umeda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PrismPlus, code=umeda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
