package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Starboard device specifications for Android Compose previews.
 *
 * This extension provides Starboard device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Starboard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Starboard: Any
  get() = object {
      /** Starboard YL */
      val YL = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
