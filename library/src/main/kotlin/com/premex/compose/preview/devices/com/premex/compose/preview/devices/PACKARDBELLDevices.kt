package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PACKARD_BELL device specifications for Android Compose previews.
 *
 * This extension provides PACKARD_BELL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PACKARDBELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PACKARDBELL: Any
  get() = object {
      /** DeviceSpec(manufacturer=PACKARD_BELL, code=M10400, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=M10400,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10400 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=M10500, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=M10500,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10500 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=M10600, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=M10600,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10600 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=M10950, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=M10950,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val M10950 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=M11550, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=M11550,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val M11550 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=M7500, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=M7500,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val M7500 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=M7600-D, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=M7600-D,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val M7600_D = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=PB1009, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=PB1009,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PB1009 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=PB101, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=PB101,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PB101 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PACKARD_BELL, code=PB9000-32, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PACKARD_BELL, code=PB9000-32,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PB9000_32 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
