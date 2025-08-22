package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yes device specifications for Android Compose previews.
 *
 * This extension provides Yes device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yes: Any
  get() = object {
      /** DeviceSpec(manufacturer=Yes, code=dwi765yes, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yes, code=dwi765yes, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DWI765YES = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Yes, code=M631Y, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yes, code=M631Y, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M631Y = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Yes, code=M685Y4, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yes, code=M685Y4, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val M685Y4 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Yes, code=SEI500Y, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yes, code=SEI500Y, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500Y = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Yes, code=SEI800Y, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yes, code=SEI800Y, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI800Y = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
