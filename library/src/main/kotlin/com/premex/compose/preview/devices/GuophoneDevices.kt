package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Guophone device specifications for Android Compose previews.
 *
 * This extension provides Guophone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Guophone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Guophone: Any
  get() = object {
      /** Guophone Guophone_XP9800 */
      val GUOPHONE_XP9800 = "spec:width=640,height=1280,unit=px,dpi=320"

  }
