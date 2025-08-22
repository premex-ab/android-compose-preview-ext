package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TONE device specifications for Android Compose previews.
 *
 * This extension provides TONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=TONE, code=TONE_e19, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TONE, code=TONE_e19, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val TONE_E19 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TONE, code=TONE_e20, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TONE, code=TONE_e20, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val TONE_E20 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TONE, code=TONE_e21, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TONE, code=TONE_e21, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val TONE_E21 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TONE, code=TONE_e22, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TONE, code=TONE_e22, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TONE_E22 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TONE, code=TONE_m15, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TONE, code=TONE_m15, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TONE_M15 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
