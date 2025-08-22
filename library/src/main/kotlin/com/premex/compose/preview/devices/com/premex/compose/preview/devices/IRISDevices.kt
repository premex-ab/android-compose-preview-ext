package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRIS device specifications for Android Compose previews.
 *
 * This extension provides IRIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRIS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRIS: Any
  get() = object {
      /** DeviceSpec(manufacturer=IRIS, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=anaheim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=beomil, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=beomil, width=1080,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val BEOMIL = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRIS, code=G7060, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=G7060, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val G7060 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRIS, code=G7100, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=G7100, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val G7100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRIS, code=G8060, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=G8060, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G8060 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRIS, code=IS2PLUS, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=IS2PLUS, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val IS2PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRIS, code=IS2S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=IS2S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IS2S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRIS, code=IS6Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=IS6Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val IS6PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRIS, code=N30, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=N30, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val N30 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IRIS, code=NEXT_P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=NEXT_P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NEXT_P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=NEXT_P_PLUS, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=NEXT_P_PLUS, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NEXT_P_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=IRIS, code=Next_P_PRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=Next_P_PRO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NEXT_P_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=NEXT_U, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=NEXT_U, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NEXT_U = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=SW4H_FF, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=SW4H_FF, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRIS, code=umeda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=umeda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRIS, code=V10, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=V10, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val V10 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRIS, code=V50, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=V50, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val V50 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRIS, code=VOX_4s, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=VOX_4s, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VOX_4S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRIS, code=Vox_5S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=Vox_5S, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VOX_5S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=VOX_Alpha, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=VOX_Alpha, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val VOX_ALPHA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=VOX_Alpha_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=VOX_Alpha_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val VOX_ALPHA_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=VOX_Energy, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=VOX_Energy, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VOX_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=VOX_POP_plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=VOX_POP_plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VOX_POP_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=VOX_POP_Pro, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=VOX_POP_Pro, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VOX_POP_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRIS, code=VOX_STEEL_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=VOX_STEEL_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val VOX_STEEL_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRIS, code=VOX_STEEL_Plus_V2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIS, code=VOX_STEEL_Plus_V2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val VOX_STEEL_PLUS_V2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
