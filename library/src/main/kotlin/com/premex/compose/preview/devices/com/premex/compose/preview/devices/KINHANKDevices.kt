package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KINHANK device specifications for Android Compose previews.
 *
 * This extension provides KINHANK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KINHANK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KINHANK: Any
  get() = object {
      /** DeviceSpec(manufacturer=KINHANK, code=YEG, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KINHANK, code=YEG, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YEG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
