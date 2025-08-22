package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WOW device specifications for Android Compose previews.
 *
 * This extension provides WOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WOW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WOW: Any
  get() = object {
      /** DeviceSpec(manufacturer=WOW, code=uiw4020wow, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOW, code=uiw4020wow, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4020WOW = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
