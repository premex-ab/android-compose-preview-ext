package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PLUZZ device specifications for Android Compose previews.
 *
 * This extension provides PLUZZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PLUZZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PLUZZ: Any
  get() = object {
      /** DeviceSpec(manufacturer=PLUZZ, code=P13, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLUZZ, code=P13, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P13 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=PLUZZ, code=PLUZZ_PL5510, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLUZZ, code=PLUZZ_PL5510,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PLUZZ_PL5510 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
