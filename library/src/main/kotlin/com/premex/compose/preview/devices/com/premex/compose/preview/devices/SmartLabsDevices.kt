package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SmartLabs device specifications for Android Compose previews.
 *
 * This extension provides SmartLabs device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SmartLabs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SmartLabs: Any
  get() = object {
      /** DeviceSpec(manufacturer=SmartLabs, code=sml5442tw, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SmartLabs, code=sml5442tw,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SML5442TW = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
