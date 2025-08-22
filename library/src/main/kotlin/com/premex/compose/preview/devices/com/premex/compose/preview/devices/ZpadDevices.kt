package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Zpad device specifications for Android Compose previews.
 *
 * This extension provides Zpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zpad: Any
  get() = object {
      /** DeviceSpec(manufacturer=Zpad, code=ZpadX7, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zpad, code=ZpadX7, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ZPADX7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Zpad, code=Zpad_X7, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zpad, code=Zpad_X7, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ZPAD_X7 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
