package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Westinghouse device specifications for Android Compose previews.
 *
 * This extension provides Westinghouse device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Westinghouse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Westinghouse: Any
  get() = object {
      /** DeviceSpec(manufacturer=Westinghouse, code=ueno, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Westinghouse, code=ueno, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UENO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Westinghouse, code=W10TWF19, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Westinghouse, code=W10TWF19,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val W10TWF19 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Westinghouse, code=WH10S9863232, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Westinghouse, code=WH10S9863232,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val WH10S9863232 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
