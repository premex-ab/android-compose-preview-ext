package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NUU device specifications for Android Compose previews.
 *
 * This extension provides NUU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NUU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NUU: Any
  get() = object {
      /** DeviceSpec(manufacturer=NUU, code=A6L-C, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=A6L-C, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A6L_C = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=A6L-G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=A6L-G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A6L_G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=N5001L, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5001L, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val N5001L = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=N5001WA, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5001WA, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val N5001WA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=N5002LA, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5002LA, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val N5002LA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=N5002LATC, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5002LATC, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val N5002LATC = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=N5501LA, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5501LA, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val N5501LA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=N5501LE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5501LE, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val N5501LE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=N5502LA, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5502LA, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val N5502LA = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=NUU, code=N5702L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5702L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val N5702L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=N5L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N5L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N5L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=N6001LA, width=480, height=960, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N6001LA, width=480,
      height=960, dpi=180, isGoogleDevice=false).code */
      val N6001LA = "spec:width=480,height=960,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=NUU, code=N6501LA, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=N6501LA, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val N6501LA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NUU, code=NUU_A1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=NUU_A1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val NUU_A1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=NUU_A3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=NUU_A3, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NUU_A3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=NUU_M2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=NUU_M2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NUU_M2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=NUU_M3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=NUU_M3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NUU_M3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=NUU_X5, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=NUU_X5, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NUU_X5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NUU, code=S5501LE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S5501LE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S5501LE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S5502LA, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S5502LA, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S5502LA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S5702LA, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S5702LA, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S5702LA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S5704LE, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S5704LE, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S5704LE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6001LE, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6001LE, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S6001LE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NUU, code=S6003LA, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6003LA, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S6003LA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6303LA, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6303LA, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val S6303LA = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NUU, code=S6303LA_Go, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6303LA_Go, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val S6303LA_GO = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NUU, code=S6304LA, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6304LA, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val S6304LA = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=NUU, code=S6501LA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6501LA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S6501LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6503LE, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6503LE, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S6503LE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6505LA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6505LA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S6505LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6512LA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6512LA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S6512LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6514LA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6514LA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S6514LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6601LA, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6601LA, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val S6601LA = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=NUU, code=S6603LA, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6603LA, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val S6603LA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6701LA, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6701LA, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val S6701LA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NUU, code=S6702XA, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6702XA, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val S6702XA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NUU, code=S6703LA, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6703LA, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val S6703LA = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NUU, code=S6704LA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6704LA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S6704LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=S6707XA, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=S6707XA, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val S6707XA = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=NUU, code=T0801LAV1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=T0801LAV1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T0801LAV1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NUU, code=T0801LAV2, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=T0801LAV2, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T0801LAV2 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=T0805LAV1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=T0805LAV1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T0805LAV1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NUU, code=T1001LA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=T1001LA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T1001LA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NUU, code=T1005LAV1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=T1005LAV1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T1005LAV1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NUU, code=X4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NUU, code=X4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X4 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
