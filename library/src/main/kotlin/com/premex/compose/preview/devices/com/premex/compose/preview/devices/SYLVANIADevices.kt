package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SYLVANIA device specifications for Android Compose previews.
 *
 * This extension provides SYLVANIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SYLVANIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SYLVANIA: Any
  get() = object {
      /** DeviceSpec(manufacturer=SYLVANIA, code=gangbyeon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYLVANIA, code=gangbyeon,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SYLVANIA, code=kanda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYLVANIA, code=kanda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KANDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SYLVANIA, code=mdt1005, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYLVANIA, code=mdt1005, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MDT1005 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SYLVANIA, code=SLTDVD1024_B, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYLVANIA, code=SLTDVD1024_B,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SLTDVD1024_B = "spec:width=600,height=1024,unit=px,dpi=160"

  }
