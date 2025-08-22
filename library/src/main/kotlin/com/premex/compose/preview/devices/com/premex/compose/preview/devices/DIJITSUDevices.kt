package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIJITSU device specifications for Android Compose previews.
 *
 * This extension provides DIJITSU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIJITSU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIJITSU: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIJITSU, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIJITSU, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIJITSU, code=Smart_A11s, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIJITSU, code=Smart_A11s,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val SMART_A11S = "spec:width=720,height=1600,unit=px,dpi=320"

  }
