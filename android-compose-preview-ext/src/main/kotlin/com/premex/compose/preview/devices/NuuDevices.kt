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
 * @Preview(device = Devices.Nuu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nuu: Any
  get() = object {
      /** NUU A6L-C */
      val A6L_C = "spec:width=480,height=960,unit=px,dpi=240"

      /** NUU A6L-G */
      val A6L_G = "spec:width=480,height=960,unit=px,dpi=240"

      /** NUU N5001L */
      val N5001L = "spec:width=480,height=854,unit=px,dpi=240"

      /** NUU N5001WA */
      val N5001WA = "spec:width=480,height=854,unit=px,dpi=240"

      /** NUU N5002LA */
      val N5002LA = "spec:width=480,height=960,unit=px,dpi=240"

      /** NUU N5002LATC */
      val N5002LATC = "spec:width=480,height=960,unit=px,dpi=240"

      /** NUU N5501LA */
      val N5501LA = "spec:width=480,height=960,unit=px,dpi=240"

      /** NUU N5501LE */
      val N5501LE = "spec:width=480,height=960,unit=px,dpi=240"

      /** NUU N5502LA */
      val N5502LA = "spec:width=480,height=960,unit=px,dpi=200"

      /** NUU N5702L */
      val N5702L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NUU N5L */
      val N5L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NUU N6001LA */
      val N6001LA = "spec:width=480,height=960,unit=px,dpi=180"

      /** NUU N6501LA */
      val N6501LA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** NUU NUU_A1 */
      val NUU_A1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** NUU NUU_A3 */
      val NUU_A3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** NUU NUU_M2 */
      val NUU_M2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NUU NUU_M3 */
      val NUU_M3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NUU NUU_X5 */
      val NUU_X5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** NUU S5501LE */
      val S5501LE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NUU S5502LA */
      val S5502LA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** NUU S5702LA */
      val S5702LA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** NUU S5704LE */
      val S5704LE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** NUU S6001LE */
      val S6001LE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** NUU S6003LA */
      val S6003LA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** NUU S6303LA */
      val S6303LA = "spec:width=480,height=1014,unit=px,dpi=213"

      /** NUU S6303LA_Go */
      val S6303LA_GO = "spec:width=480,height=1014,unit=px,dpi=213"

      /** NUU S6304LA */
      val S6304LA = "spec:width=720,height=1560,unit=px,dpi=280"

      /** NUU S6501LA */
      val S6501LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** NUU S6503LE */
      val S6503LE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** NUU S6505LA */
      val S6505LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** NUU S6512LA */
      val S6512LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** NUU S6514LA */
      val S6514LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** NUU S6601LA */
      val S6601LA = "spec:width=720,height=1612,unit=px,dpi=280"

      /** NUU S6603LA */
      val S6603LA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** NUU S6701LA */
      val S6701LA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** NUU S6702XA */
      val S6702XA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** NUU S6703LA */
      val S6703LA = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** NUU S6704LA */
      val S6704LA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** NUU S6707XA */
      val S6707XA = "spec:width=720,height=1600,unit=px,dpi=300"

      /** NUU T0801LAV1 */
      val T0801LAV1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NUU T0801LAV2 */
      val T0801LAV2 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** NUU T0805LAV1 */
      val T0805LAV1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** NUU T1001LA */
      val T1001LA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** NUU T1005LAV1 */
      val T1005LAV1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NUU X4 */
      val X4 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
