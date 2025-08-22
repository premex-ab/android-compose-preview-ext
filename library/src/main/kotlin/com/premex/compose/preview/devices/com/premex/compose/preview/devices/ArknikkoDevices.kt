package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Arknikko device specifications for Android Compose previews.
 *
 * This extension provides Arknikko device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Arknikko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Arknikko: Any
  get() = object {
      /** DeviceSpec(manufacturer=Arknikko, code=MemoPad_T3_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Arknikko, code=MemoPad_T3_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MEMOPAD_T3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Arknikko, code=Memopad_T4, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Arknikko, code=Memopad_T4,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MEMOPAD_T4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Arknikko, code=SophPad_X11, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Arknikko, code=SophPad_X11,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SOPHPAD_X11 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Arknikko, code=SophPad_X22_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Arknikko, code=SophPad_X22_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SOPHPAD_X22_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
