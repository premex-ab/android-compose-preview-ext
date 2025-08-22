package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOBLEX device specifications for Android Compose previews.
 *
 * This extension provides NOBLEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOBLEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOBLEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=NOBLEX, code=A50UNS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=A50UNS, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A50UNS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NOBLEX, code=A60UNS, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=A60UNS, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A60UNS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NOBLEX, code=N405, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=N405, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val N405 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NOBLEX, code=N503, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=N503, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N503 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOBLEX, code=N504, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=N504, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val N504 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NOBLEX, code=N551, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=N551, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N551 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOBLEX, code=N552, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=N552, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N552 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOBLEX, code=N601, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=N601, width=720,
      height=1528, dpi=280, isGoogleDevice=false).code */
      val N601 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=NOBLEX, code=NOBLEX_B30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=NOBLEX_B30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOBLEX_B30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOBLEX, code=NOBLEX_N52, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=NOBLEX_N52, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOBLEX_N52 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOBLEX, code=NOBLEX_N62, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=NOBLEX_N62,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val NOBLEX_N62 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NOBLEX, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NOBLEX, code=sunnyvale, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=sunnyvale, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NOBLEX, code=Tablet, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=Tablet, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NOBLEX, code=TN11A6128, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOBLEX, code=TN11A6128, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TN11A6128 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
