package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FREETEL device specifications for Android Compose previews.
 *
 * This extension provides FREETEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FREETEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FREETEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=FREETEL, code=Cricket_Wave, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=Cricket_Wave,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CRICKET_WAVE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FREETEL, code=FTJ152D, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=FTJ152D, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val FTJ152D = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=FREETEL, code=FTJ161A, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=FTJ161A, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val FTJ161A = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FREETEL, code=FTJ161B, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=FTJ161B, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val FTJ161B = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FREETEL, code=FTU161G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=FTU161G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FTU161G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FREETEL, code=Priori4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=Priori4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIORI4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FREETEL, code=Priori5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=Priori5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIORI5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FREETEL, code=RAIJIN, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=RAIJIN, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RAIJIN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FREETEL, code=SAKURA_FTE1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=SAKURA_FTE1,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val SAKURA_FTE1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FREETEL, code=SAMURAI_KIWAMI2, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=SAMURAI_KIWAMI2,
      width=1440, height=2560, dpi=640, isGoogleDevice=false).code */
      val SAMURAI_KIWAMI2 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=FREETEL, code=SAMURAI_REI2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FREETEL, code=SAMURAI_REI2,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val SAMURAI_REI2 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
