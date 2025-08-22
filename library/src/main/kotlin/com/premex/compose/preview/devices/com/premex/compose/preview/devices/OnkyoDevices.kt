package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Onkyo device specifications for Android Compose previews.
 *
 * This extension provides Onkyo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onkyo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onkyo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Onkyo, code=Gravity_128, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Onkyo, code=Gravity_128,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GRAVITY_128 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Onkyo, code=Rai_Zin2R_64, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Onkyo, code=Rai_Zin2R_64,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val RAI_ZIN2R_64 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Onkyo, code=Rai_Zin_32, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Onkyo, code=Rai_Zin_32, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RAI_ZIN_32 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
