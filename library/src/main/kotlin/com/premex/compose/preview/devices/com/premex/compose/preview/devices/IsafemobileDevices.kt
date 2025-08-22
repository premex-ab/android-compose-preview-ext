package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * isafemobile device specifications for Android Compose previews.
 *
 * This extension provides isafemobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Isafemobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Isafemobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=isafemobile, code=IS330, width=320, height=432, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafemobile, code=IS330, width=320,
      height=432, dpi=160, isGoogleDevice=false).code */
      val IS330 = "spec:width=320,height=432,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=isafemobile, code=IS530, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafemobile, code=IS530, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IS530 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=isafemobile, code=IS540, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafemobile, code=IS540,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val IS540 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=isafemobile, code=IS655, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafemobile, code=IS655, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IS655 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=isafemobile, code=IS880, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafemobile, code=IS880, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IS880 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=isafemobile, code=IS930, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafemobile, code=IS930,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val IS930 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=isafemobile, code=IS940, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=isafemobile, code=IS940,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val IS940 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
