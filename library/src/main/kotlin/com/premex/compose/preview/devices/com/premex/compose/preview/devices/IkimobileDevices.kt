package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ikimobile device specifications for Android Compose previews.
 *
 * This extension provides ikimobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ikimobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ikimobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=ikimobile, code=BLESSPLUS, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ikimobile, code=BLESSPLUS,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BLESSPLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ikimobile, code=GO5_55, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ikimobile, code=GO5_55, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GO5_55 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
