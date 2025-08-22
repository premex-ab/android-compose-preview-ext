package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Packard_Bell device specifications for Android Compose previews.
 *
 * This extension provides Packard_Bell device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PackardBell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PackardBell: Any
  get() = object {
      /** DeviceSpec(manufacturer=Packard_Bell, code=DAYTONA-G12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell, code=DAYTONA-G12,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val DAYTONA_G12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Packard_Bell, code=DAYTONA-G6, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell, code=DAYTONA-G6,
      width=480, height=960, dpi=220, isGoogleDevice=false).code */
      val DAYTONA_G6 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Packard_Bell, code=INTERLAGOS-T32, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell,
      code=INTERLAGOS-T32, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val INTERLAGOS_T32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Packard_Bell, code=M10905-32, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell, code=M10905-32,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10905_32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Packard_Bell, code=MONZA-T5, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell, code=MONZA-T5,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MONZA_T5 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Packard_Bell, code=SILVERSTONE-T10, width=1200, height=1920,
      dpi=200, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell,
      code=SILVERSTONE-T10, width=1200, height=1920, dpi=200, isGoogleDevice=false).code */
      val SILVERSTONE_T10 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Packard_Bell, code=Silverstone-T10X, width=1200, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell,
      code=Silverstone-T10X, width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SILVERSTONE_T10X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Packard_Bell, code=SILVERSTONE-T11, width=1200, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell,
      code=SILVERSTONE-T11, width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SILVERSTONE_T11 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Packard_Bell, code=SILVERSTONE-T18, width=1200, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell,
      code=SILVERSTONE-T18, width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SILVERSTONE_T18 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Packard_Bell, code=TARGA-F10PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Packard_Bell, code=TARGA-F10PRO,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TARGA_F10PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
