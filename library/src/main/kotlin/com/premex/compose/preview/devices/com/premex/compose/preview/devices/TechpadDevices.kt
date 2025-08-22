package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Techpad device specifications for Android Compose previews.
 *
 * This extension provides Techpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Techpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Techpad: Any
  get() = object {
      /** DeviceSpec(manufacturer=Techpad, code=M55_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Techpad, code=M55_4G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M55_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Techpad, code=M5GO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Techpad, code=M5GO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M5GO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Techpad, code=Note_4CAM_R, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Techpad, code=Note_4CAM_R,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val NOTE_4CAM_R = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Techpad, code=S6, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Techpad, code=S6, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S6 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
