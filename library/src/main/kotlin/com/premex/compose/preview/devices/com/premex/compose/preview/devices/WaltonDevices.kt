package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Walton device specifications for Android Compose previews.
 *
 * This extension provides Walton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Walton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Walton: Any
  get() = object {
      /** DeviceSpec(manufacturer=Walton, code=osaki, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=osaki, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Walton, code=Primo_G8i, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_G8i, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_G8I = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Walton, code=Primo_G8i_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_G8i_4G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_G8I_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Walton, code=Primo_GF7, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_GF7, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_GF7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Walton, code=Primo_GM2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_GM2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_GM2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Walton, code=Primo_GM2_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_GM2_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_GM2_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Walton, code=Primo_H7s, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_H7s, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PRIMO_H7S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Walton, code=Primo_NF3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_NF3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_NF3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Walton, code=Primo_NH3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_NH3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_NH3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Walton, code=Primo_NH3_Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_NH3_Lite,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_NH3_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Walton, code=Primo_RX6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Primo_RX6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PRIMO_RX6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Walton, code=Walpad10HProMax, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=Walpad10HProMax,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val WALPAD10HPROMAX = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Walton, code=WALPAD_9G, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Walton, code=WALPAD_9G, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val WALPAD_9G = "spec:width=800,height=1340,unit=px,dpi=213"

  }
