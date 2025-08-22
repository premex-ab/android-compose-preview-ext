package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pioneer device specifications for Android Compose previews.
 *
 * This extension provides Pioneer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pioneer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pioneer: Any
  get() = object {
      /** DeviceSpec(manufacturer=Pioneer, code=Fu_Zin2R_32, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pioneer, code=Fu_Zin2R_32,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val FU_ZIN2R_32 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Pioneer, code=Fu_Zin_32, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pioneer, code=Fu_Zin_32, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FU_ZIN_32 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Pioneer, code=SDA_80TAB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pioneer, code=SDA_80TAB, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SDA_80TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Pioneer, code=SDA_835TAB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pioneer, code=SDA_835TAB,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SDA_835TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Pioneer, code=SDA_8TAB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pioneer, code=SDA_8TAB, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SDA_8TAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
