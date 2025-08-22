package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DOOGEE device specifications for Android Compose previews.
 *
 * This extension provides DOOGEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DOOGEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DOOGEE: Any
  get() = object {
      /** DeviceSpec(manufacturer=DOOGEE, code=BL5000, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=BL5000, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BL5000 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=BL5500_Lite, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=BL5500_Lite,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val BL5500_LITE = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=BL7000, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=BL7000, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BL7000 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=doogee-X10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=doogee-X10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val DOOGEE_X10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=F1C, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F1C, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F1C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=F1CK, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F1CK, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F1CK = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=F1CT, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F1CT, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F1CT = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=F1G, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F1G, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F1G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=F1P, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F1P, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F1P = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=F1PS, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F1PS, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val F1PS = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=F1S, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F1S, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F1S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=F1SE, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F1SE, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val F1SE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=F2PS, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=F2PS, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val F2PS = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M19H, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M19H, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M19H = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=M21, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M21, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M21 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=M21T, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M21T, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M21T = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=M21TE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M21TE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M21TE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=M21TP, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M21TP, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M21TP = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=M21TU, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M21TU, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val M21TU = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=M22, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M22, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M22 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M22C, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M22C, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M22C = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M22CT, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M22CT, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M22CT = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M22G, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M22G, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M22G = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M22GS, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M22GS, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M22GS = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M22GTS, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M22GTS, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M22GTS = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M22H, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M22H, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M22H = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M22P, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M22P, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M22P = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23H, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23H, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23H = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23HC_1, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23HC_1, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23HC_1 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23HE, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23HE, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23HE = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23HT, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23HT, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23HT = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23S, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23S, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23T, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23T, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23T = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23U, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23U, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23U = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M23UT, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M23UT, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val M23UT = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M24C, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M24C, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val M24C = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M24CT, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M24CT, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val M24CT = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M24P, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M24P, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val M24P = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M24PS, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M24PS, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val M24PS = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M24PT, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M24PT, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val M24PT = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=M24SE, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=M24SE, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val M24SE = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=MIX, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=MIX, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MIX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=N100, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=N100, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val N100 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=N20, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=N20, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val N20 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=N20Pro, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=N20Pro, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val N20PRO = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=N30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=N30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val N30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=N40Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=N40Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val N40PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=P1, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P1, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P1D, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P1D, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P1D = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P1S_2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P1S_2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P1S_2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P1T, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P1T, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P1T = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P1_2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P1_2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P1_2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P2, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P2, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val P2 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P2D, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P2D, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val P2D = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P2T, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P2T, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val P2T = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P2TH, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P2TH, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val P2TH = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val P3 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3C, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3C, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P3C = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3D_2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3D_2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P3D_2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3Mini, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3Mini, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P3MINI = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3MiniS, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3MiniS, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val P3MINIS = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3Mini_Kid, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3Mini_Kid,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val P3MINI_KID = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3Pro, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3Pro, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val P3PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3T, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3T, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val P3T = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=P3_Plus, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P3_Plus, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val P3_PLUS = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=P4, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P4, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P4 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DOOGEE, code=P5S, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P5S, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P5S = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=P7, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=P7, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val P7 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOOGEE, code=PT1, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=PT1, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val PT1 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=PT2, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=PT2, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val PT2 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=PT3, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=PT3, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val PT3 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=DOOGEE, code=RK1, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=RK1, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val RK1 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=DOOGEE, code=RK1KID, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=RK1KID, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val RK1KID = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=DOOGEE, code=RK1S, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=RK1S, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val RK1S = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=DOOGEE, code=RK2, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=RK2, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val RK2 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=DOOGEE, code=RK2KID, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=RK2KID, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val RK2KID = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=DOOGEE, code=S30, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S30, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S35, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S35, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S35 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S35H, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S35H, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S35H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S35Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S35Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S35PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S35T, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S35T, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S35T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S40, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S40, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S40 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=S40Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S40Lite, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S40LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=S40Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S40Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S40PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S51, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S51, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S51 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S55, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S55_Lite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S55_Lite, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S55_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S58Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S58Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S58PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S59, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S59, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S59 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S59Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S59Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S59PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S60, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S60, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val S60 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S60Lite, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S60Lite, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val S60LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S61, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S61, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S68Pro, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S68Pro, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val S68PRO = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S70, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S70, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S70 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S70Lite, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S70Lite, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S70LITE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S80, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S80, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S80 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S80Lite, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S80Lite, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S80LITE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S86, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S86, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S86 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S86Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S86Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S86PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S88Plus, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S88Plus, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S88PLUS = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S88Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S88Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S88PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S89, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S89, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S89 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S89Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S89Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S89PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S90C, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S90C, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val S90C = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S90Pro, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S90Pro, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val S90PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S95, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S95, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S95 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S95Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S95Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S95PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S96Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S96Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S96PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S97Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S97Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S97PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=S98, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S98, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S98 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=S98Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=S98Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S98PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=Selfie, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Selfie, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SELFIE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=Shoot_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Shoot_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHOOT_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=T1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=T1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DOOGEE, code=T2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=T2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DOOGEE, code=T2U, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=T2U, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T2U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DOOGEE, code=t530_dg_a54, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t530_dg_a54,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val T530_DG_A54 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=t591_dga57_we, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t591_dga57_we,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val T591_DGA57_WE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=t596_dg_d5506_x60l, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t596_dg_d5506_x60l,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val T596_DG_D5506_X60L = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=t596_dg_x60l, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t596_dg_x60l,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val T596_DG_X60L = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=t758_dg_a67t_n, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t758_dg_a67t_n,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val T758_DG_A67T_N = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=t758_dg_m3t_n, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t758_dg_m3t_n,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val T758_DG_M3T_N = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=t766_dg_a66, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t766_dg_a66,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val T766_DG_A66 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=t766_dg_n_mix, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t766_dg_n_mix,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val T766_DG_N_MIX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=t777_dg_m1_65_n, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=t777_dg_m1_65_n,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val T777_DG_M1_65_N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=V10, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=V10, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val V10 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=V20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=V20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X11, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X11, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val X11 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X20L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X20L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X20L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X30, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X30, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X50L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X50L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X50L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X53, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X53, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X53 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X55, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X55, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X55 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=x5602_fxkj_k20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=x5602_fxkj_k20,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X5602_FXKJ_K20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X5max, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X5max, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X5MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X5max_PRO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X5max_PRO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X5MAX_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X60, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X60, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=x6069_dg_a50_37m65, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=x6069_dg_a50_37m65,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X6069_DG_A50_37M65 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X60L, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X60L, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X60L = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X70, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X70, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val X70 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X80, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X80, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X80 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X90, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X90, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val X90 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X90L, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X90L, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val X90L = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X93, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X93, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val X93 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X95, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X95, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val X95 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X95i, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X95i, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X95I = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X95Pro, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X95Pro, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val X95PRO = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=X96, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X96, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X96 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X96Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X96Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X96PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X97Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X97Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X97PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=X9pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=X9pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X9PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=Y6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Y6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=Y7, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Y7, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val Y7 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=Y7Plus, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Y7Plus, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val Y7PLUS = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=Y8, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Y8, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val Y8 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=Y8C, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Y8C, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val Y8C = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=Y8Plus, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Y8Plus, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val Y8PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=Y9Plus, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=Y9Plus, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val Y9PLUS = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN133S, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN133S, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ZN133S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN133T, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN133T, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ZN133T = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN136T, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN136T, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val ZN136T = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN137, width=480, height=1170, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN137, width=480,
      height=1170, dpi=240, isGoogleDevice=false).code */
      val ZN137 = "spec:width=480,height=1170,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN138, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN138, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ZN138 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN138P, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN138P, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val ZN138P = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN138PE, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN138PE, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val ZN138PE = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN140, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN140, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ZN140 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=ZN140S, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=ZN140S, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ZN140S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOOGEE, code=1917, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1917, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val _1917 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1918, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1918, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1918 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1918D, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1918D, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1918D = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1918N, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1918N, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1918N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1918T, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1918T, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1918T = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1918Y, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1918Y, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1918Y = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1928, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1928, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val _1928 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1928P, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1928P, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val _1928P = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1928S, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1928S, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val _1928S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1928Y, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1928Y, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val _1928Y = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1929C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1929C, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1929C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1929H, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1929H, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1929H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1929SC, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1929SC, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1929SC = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOOGEE, code=1929ST, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOOGEE, code=1929ST, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val _1929ST = "spec:width=720,height=1600,unit=px,dpi=320"

  }
