package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Panodic device specifications for Android Compose previews.
 *
 * This extension provides Panodic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Panodic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Panodic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Panodic, code=IPHDCK16H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panodic, code=IPHDCK16H,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val IPHDCK16H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
