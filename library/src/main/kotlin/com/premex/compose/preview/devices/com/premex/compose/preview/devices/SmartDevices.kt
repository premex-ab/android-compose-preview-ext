package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smart device specifications for Android Compose previews.
 *
 * This extension provides Smart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smart: Any
  get() = object {
      /** DeviceSpec(manufacturer=Smart, code=hero_A1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smart, code=hero_A1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HERO_A1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Smart, code=Smart_Hero_II, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smart, code=Smart_Hero_II,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val SMART_HERO_II = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Smart, code=Smart_PRIME_II, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smart, code=Smart_PRIME_II,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SMART_PRIME_II = "spec:width=480,height=960,unit=px,dpi=240"

  }
