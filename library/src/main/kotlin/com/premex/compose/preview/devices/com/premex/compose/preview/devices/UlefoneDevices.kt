package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ulefone device specifications for Android Compose previews.
 *
 * This extension provides ulefone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ulefone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ulefone: Any
  get() = object {
      /** DeviceSpec(manufacturer=ulefone, code=Armor_3, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ulefone, code=Armor_3, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ARMOR_3 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ulefone, code=MIX_2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ulefone, code=MIX_2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MIX_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ulefone, code=Power_3, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ulefone, code=Power_3, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val POWER_3 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ulefone, code=Power_3S, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ulefone, code=Power_3S, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val POWER_3S = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ulefone, code=t816_gq_ulefone, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ulefone, code=t816_gq_ulefone,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val T816_GQ_ULEFONE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
