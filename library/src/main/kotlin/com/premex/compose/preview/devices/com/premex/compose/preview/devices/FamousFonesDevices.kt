package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Famous_Fones device specifications for Android Compose previews.
 *
 * This extension provides Famous_Fones device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FamousFones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FamousFones: Any
  get() = object {
      /** DeviceSpec(manufacturer=Famous_Fones, code=Famous_5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Famous_Fones, code=Famous_5,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val FAMOUS_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Famous_Fones, code=Famous_5Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Famous_Fones, code=Famous_5Plus,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val FAMOUS_5PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Famous_Fones, code=Famous_Red_5Plus, width=720, height=1498,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Famous_Fones,
      code=Famous_Red_5Plus, width=720, height=1498, dpi=320, isGoogleDevice=false).code */
      val FAMOUS_RED_5PLUS = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Famous_Fones, code=Famous_TAB_10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Famous_Fones, code=Famous_TAB_10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val FAMOUS_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Famous_Fones, code=Red_Royal_Edition, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Famous_Fones,
      code=Red_Royal_Edition, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val RED_ROYAL_EDITION = "spec:width=720,height=1440,unit=px,dpi=320"

  }
