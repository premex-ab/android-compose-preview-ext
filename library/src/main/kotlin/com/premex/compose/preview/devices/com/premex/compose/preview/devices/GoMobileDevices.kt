package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GoMobile device specifications for Android Compose previews.
 *
 * This extension provides GoMobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GoMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GoMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=GoMobile, code=GO_SMART, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GoMobile, code=GO_SMART, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GO_SMART = "spec:width=480,height=854,unit=px,dpi=240"

  }
