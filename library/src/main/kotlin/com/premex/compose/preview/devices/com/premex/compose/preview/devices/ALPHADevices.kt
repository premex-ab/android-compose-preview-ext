package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALPHA device specifications for Android Compose previews.
 *
 * This extension provides ALPHA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALPHA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALPHA: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALPHA, code=hayward, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALPHA, code=hayward, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HAYWARD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALPHA, code=lushan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALPHA, code=lushan, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
