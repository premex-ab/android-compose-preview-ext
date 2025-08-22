package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KXD device specifications for Android Compose previews.
 *
 * This extension provides KXD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KXD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KXD: Any
  get() = object {
      /** DeviceSpec(manufacturer=KXD, code=A06, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=A06, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val A06 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KXD, code=A07, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=A07, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val A07 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KXD, code=A08, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=A08, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A08 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KXD, code=A1, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=A1, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val A1 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KXD, code=A11, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=A11, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val A11 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KXD, code=A8, width=480, height=1014, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=A8, width=480,
      height=1014, dpi=240, isGoogleDevice=false).code */
      val A8 = "spec:width=480,height=1014,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KXD, code=Blus_Sea_S25_Plus, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=Blus_Sea_S25_Plus,
      width=720, height=1612, dpi=480, isGoogleDevice=false).code */
      val BLUS_SEA_S25_PLUS = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KXD, code=D26, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=D26, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val D26 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=KXD, code=D58, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=D58, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val D58 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KXD, code=D68S, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=D68S, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val D68S = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KXD, code=D70, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=D70, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val D70 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=KXD, code=K30M, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=K30M, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K30M = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KXD, code=T50, width=240, height=296, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=T50, width=240,
      height=296, dpi=120, isGoogleDevice=false).code */
      val T50 = "spec:width=240,height=296,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=KXD, code=T50Y, width=320, height=385, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=T50Y, width=320,
      height=385, dpi=160, isGoogleDevice=false).code */
      val T50Y = "spec:width=320,height=385,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KXD, code=T55, width=320, height=385, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=T55, width=320,
      height=385, dpi=160, isGoogleDevice=false).code */
      val T55 = "spec:width=320,height=385,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KXD, code=T55S, width=320, height=385, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=T55S, width=320,
      height=385, dpi=160, isGoogleDevice=false).code */
      val T55S = "spec:width=320,height=385,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KXD, code=Universe_S24_Plus, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=Universe_S24_Plus,
      width=720, height=1612, dpi=480, isGoogleDevice=false).code */
      val UNIVERSE_S24_PLUS = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KXD, code=W55Y, width=240, height=296, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=W55Y, width=240,
      height=296, dpi=120, isGoogleDevice=false).code */
      val W55Y = "spec:width=240,height=296,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=KXD, code=X10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=X10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KXD, code=X7g, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=X7g, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val X7G = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KXD, code=X7s, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=X7s, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val X7S = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KXD, code=Y20, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=Y20, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val Y20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KXD, code=6Cb, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KXD, code=6Cb, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val _6CB = "spec:width=480,height=960,unit=px,dpi=213"

  }
