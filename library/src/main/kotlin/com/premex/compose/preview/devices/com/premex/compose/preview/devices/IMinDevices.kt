package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iMin device specifications for Android Compose previews.
 *
 * This extension provides iMin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IMin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IMin: Any
  get() = object {
      /** DeviceSpec(manufacturer=iMin, code=Crane1, width=1200, height=1920, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Crane1, width=1200,
      height=1920, dpi=220, isGoogleDevice=false).code */
      val CRANE1 = "spec:width=1200,height=1920,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=iMin, code=Falcon2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Falcon2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val FALCON2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iMin, code=I22T01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=I22T01, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val I22T01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iMin, code=Lark1, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Lark1, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LARK1 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iMin, code=Swan1Pro, width=1080, height=1920, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Swan1Pro, width=1080,
      height=1920, dpi=220, isGoogleDevice=false).code */
      val SWAN1PRO = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=iMin, code=Swan2, width=1080, height=1920, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Swan2, width=1080,
      height=1920, dpi=186, isGoogleDevice=false).code */
      val SWAN2 = "spec:width=1080,height=1920,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=iMin, code=Swan2Printer, width=1080, height=1920, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Swan2Printer,
      width=1080, height=1920, dpi=220, isGoogleDevice=false).code */
      val SWAN2PRINTER = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=iMin, code=Swift1Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Swift1Pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val SWIFT1PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iMin, code=Swift2, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Swift2, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val SWIFT2 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iMin, code=Swift2Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMin, code=Swift2Pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val SWIFT2PRO = "spec:width=720,height=1600,unit=px,dpi=280"

  }
