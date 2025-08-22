package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ymobile device specifications for Android Compose previews.
 *
 * This extension provides Ymobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ymobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ymobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ymobile, code=P450A01, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ymobile, code=P450A01, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val P450A01 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
