package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Invens device specifications for Android Compose previews.
 *
 * This extension provides Invens device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Invens.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Invens: Any
  get() = object {
      /** DeviceSpec(manufacturer=Invens, code=K1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Invens, code=K1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Invens, code=MAX5, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Invens, code=MAX5, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val MAX5 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Invens, code=MAX8, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Invens, code=MAX8, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val MAX8 = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Invens, code=MAX9, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Invens, code=MAX9, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val MAX9 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
