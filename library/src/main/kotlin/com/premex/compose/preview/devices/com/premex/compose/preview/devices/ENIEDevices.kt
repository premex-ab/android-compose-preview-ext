package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ENIE device specifications for Android Compose previews.
 *
 * This extension provides ENIE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ENIE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ENIE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ENIE, code=E4Pro, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENIE, code=E4Pro, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E4PRO = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ENIE, code=EH3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENIE, code=EH3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val EH3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ENIE, code=ENIE_E2, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENIE, code=ENIE_E2, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val ENIE_E2 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ENIE, code=SKT119, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENIE, code=SKT119, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SKT119 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ENIE, code=SKT706, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENIE, code=SKT706, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SKT706 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ENIE, code=VT8216, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENIE, code=VT8216, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val VT8216 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
