package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MobiIoT device specifications for Android Compose previews.
 *
 * This extension provides MobiIoT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MobiIoT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MobiIoT: Any
  get() = object {
      /** DeviceSpec(manufacturer=MobiIoT, code=MobiGo2, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=MobiGo2, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val MOBIGO2 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MobiIoT, code=MobiGo2L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=MobiGo2L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MOBIGO2L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MobiIoT, code=MobiGo2P, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=MobiGo2P, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val MOBIGO2P = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MobiIoT, code=MobiGo2PP, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=MobiGo2PP, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val MOBIGO2PP = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MobiIoT, code=MobiGo2PQV, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=MobiGo2PQV,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val MOBIGO2PQV = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MobiIoT, code=MobiPrint4_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=MobiPrint4_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MOBIPRINT4_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MobiIoT, code=MP5, width=720, height=1440, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=MP5, width=720,
      height=1440, dpi=300, isGoogleDevice=false).code */
      val MP5 = "spec:width=720,height=1440,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=MobiIoT, code=WM19, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=WM19, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val WM19 = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MobiIoT, code=WM58, width=576, height=1152, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MobiIoT, code=WM58, width=576,
      height=1152, dpi=200, isGoogleDevice=false).code */
      val WM58 = "spec:width=576,height=1152,unit=px,dpi=200"

  }
