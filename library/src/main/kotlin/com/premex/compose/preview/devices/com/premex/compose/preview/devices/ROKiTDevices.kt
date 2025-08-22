package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ROKiT device specifications for Android Compose previews.
 *
 * This extension provides ROKiT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ROKiT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ROKiT: Any
  get() = object {
      /** DeviceSpec(manufacturer=ROKiT, code=Chinchilla, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ROKiT, code=Chinchilla, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CHINCHILLA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ROKiT, code=Dingo, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ROKiT, code=Dingo, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DINGO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ROKiT, code=Emu, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ROKiT, code=Emu, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val EMU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ROKiT, code=Gecko, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ROKiT, code=Gecko, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GECKO = "spec:width=480,height=960,unit=px,dpi=240"

  }
