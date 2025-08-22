package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Remdun device specifications for Android Compose previews.
 *
 * This extension provides Remdun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Remdun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Remdun: Any
  get() = object {
      /** DeviceSpec(manufacturer=Remdun, code=RD115MQE, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD115MQE, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RD115MQE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD11PT, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD11PT, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RD11PT = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Remdun, code=RD15QE, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD15QE, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RD15QE = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Remdun, code=RD16Q, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD16Q, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RD16Q = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD16QE, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD16QE, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val RD16QE = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Remdun, code=RD195T, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD195T, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RD195T = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD1XT, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD1XT, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RD1XT = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD40T, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD40T, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RD40T = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Remdun, code=RD40TE, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD40TE, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RD40TE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Remdun, code=RD50T, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD50T, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RD50T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD50TE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD50TE, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RD50TE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD51QE, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD51QE, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RD51QE = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Remdun, code=RD52E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD52E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RD52E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD60TE, width=720, height=1440, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD60TE, width=720,
      height=1440, dpi=360, isGoogleDevice=false).code */
      val RD60TE = "spec:width=720,height=1440,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Remdun, code=RD62E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD62E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RD62E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD695TE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD695TE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RD695TE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD86, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD86, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RD86 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD86E, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD86E, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RD86E = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Remdun, code=RD86QE, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Remdun, code=RD86QE, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RD86QE = "spec:width=800,height=1280,unit=px,dpi=240"

  }
