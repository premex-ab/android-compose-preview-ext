package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KRIP device specifications for Android Compose previews.
 *
 * This extension provides KRIP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KRIP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KRIP: Any
  get() = object {
      /** DeviceSpec(manufacturer=KRIP, code=K4b, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K4b, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val K4B = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=K4m, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K4m, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val K4M = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=K5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=K50, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K50, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val K50 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=KRIP, code=K51, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K51, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val K51 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=KRIP, code=K55g, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K55g, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K55G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K55h, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K55h, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K55H = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=K57, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K57, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K57 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K58, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K58, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K58 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K58b, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K58b, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K58B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K5b, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K5b, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K5B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K5c, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K5c, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K5C = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=K5d, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K5d, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K5D = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=K5m, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K5m, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K5M = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=K6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val K6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=K60, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K60, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K65, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K65, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val K65 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K66, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K66, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K66 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K68, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K68, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val K68 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KRIP, code=K69, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K69, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val K69 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=K6b, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=K6b, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val K6B = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KRIP, code=KRIP_K4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=KRIP_K4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val KRIP_K4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRIP, code=KRIP_K55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=KRIP_K55, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KRIP_K55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRIP, code=KRIP_K700A, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRIP, code=KRIP_K700A, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KRIP_K700A = "spec:width=480,height=960,unit=px,dpi=240"

  }
