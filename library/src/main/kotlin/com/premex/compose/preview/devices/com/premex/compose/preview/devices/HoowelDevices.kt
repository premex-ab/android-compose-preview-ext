package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hoowel device specifications for Android Compose previews.
 *
 * This extension provides Hoowel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hoowel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hoowel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hoowel, code=lakeside, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hoowel, code=lakeside, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hoowel, code=nagai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hoowel, code=nagai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
