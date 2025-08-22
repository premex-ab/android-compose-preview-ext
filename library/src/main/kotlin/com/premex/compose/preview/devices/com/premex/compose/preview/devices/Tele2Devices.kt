package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tele2 device specifications for Android Compose previews.
 *
 * This extension provides Tele2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tele2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tele2: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tele2, code=KSTB4231, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tele2, code=KSTB4231, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB4231 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tele2, code=SEI700TE, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tele2, code=SEI700TE, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700TE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tele2, code=Tele2_Maxi, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tele2, code=Tele2_Maxi, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TELE2_MAXI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Tele2, code=Tele2_Maxi_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tele2, code=Tele2_Maxi_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TELE2_MAXI_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tele2, code=Tele2_Midi_2_0, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tele2, code=Tele2_Midi_2_0,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TELE2_MIDI_2_0 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Tele2, code=Tele2_Mini, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tele2, code=Tele2_Mini, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TELE2_MINI = "spec:width=480,height=800,unit=px,dpi=240"

  }
