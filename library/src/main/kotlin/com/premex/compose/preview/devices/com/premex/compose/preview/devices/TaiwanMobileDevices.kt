package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TaiwanMobile device specifications for Android Compose previews.
 *
 * This extension provides TaiwanMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TaiwanMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TaiwanMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=TaiwanMobile, code=Amazing_A32, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TaiwanMobile, code=Amazing_A32,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val AMAZING_A32 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TaiwanMobile, code=Amazing_A35, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TaiwanMobile, code=Amazing_A35,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val AMAZING_A35 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TaiwanMobile, code=Amazing_A55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TaiwanMobile, code=Amazing_A55,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val AMAZING_A55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TaiwanMobile, code=Amazing_A57, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TaiwanMobile, code=Amazing_A57,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val AMAZING_A57 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
