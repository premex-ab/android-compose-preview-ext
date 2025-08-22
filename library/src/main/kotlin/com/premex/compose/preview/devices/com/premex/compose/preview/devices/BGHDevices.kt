package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BGH device specifications for Android Compose previews.
 *
 * This extension provides BGH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BGH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BGH: Any
  get() = object {
      /** DeviceSpec(manufacturer=BGH, code=BGH_Joy_303, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=BGH_Joy_303, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BGH_JOY_303 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BGH, code=hamamatsucho, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=hamamatsucho, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BGH, code=kenton, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=kenton, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BGH, code=lasalle, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=lasalle, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BGH, code=N918St, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=N918St, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N918ST = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BGH, code=P635A20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=P635A20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635A20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BGH, code=sunnyvale, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=sunnyvale, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BGH, code=xiaoyushan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=xiaoyushan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BGH, code=ZTE_Blade_A475, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=ZTE_Blade_A475,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_A475 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BGH, code=ZTE_Blade_V580, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BGH, code=ZTE_Blade_V580,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_V580 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
