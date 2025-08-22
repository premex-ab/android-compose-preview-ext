package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FourMobile device specifications for Android Compose previews.
 *
 * This extension provides FourMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FourMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FourMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=FourMobile, code=S710_Ruby, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FourMobile, code=S710_Ruby,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val S710_RUBY = "spec:width=720,height=1280,unit=px,dpi=320"

  }
