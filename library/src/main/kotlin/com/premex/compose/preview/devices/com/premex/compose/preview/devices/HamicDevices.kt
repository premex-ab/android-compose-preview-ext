package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hamic device specifications for Android Compose previews.
 *
 * This extension provides Hamic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hamic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hamic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hamic, code=MIELS, width=540, height=1080, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hamic, code=MIELS, width=540,
      height=1080, dpi=260, isGoogleDevice=false).code */
      val MIELS = "spec:width=540,height=1080,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Hamic, code=POCKET, width=480, height=640, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hamic, code=POCKET, width=480,
      height=640, dpi=190, isGoogleDevice=false).code */
      val POCKET = "spec:width=480,height=640,unit=px,dpi=190"

  }
