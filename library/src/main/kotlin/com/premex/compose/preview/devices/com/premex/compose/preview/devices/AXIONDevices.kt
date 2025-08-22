package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AXION device specifications for Android Compose previews.
 *
 * This extension provides AXION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AXION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AXION: Any
  get() = object {
      /** DeviceSpec(manufacturer=AXION, code=SBAA1011, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AXION, code=SBAA1011, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SBAA1011 = "spec:width=720,height=1280,unit=px,dpi=160"

  }
