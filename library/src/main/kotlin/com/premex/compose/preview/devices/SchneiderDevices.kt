package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Schneider device specifications for Android Compose previews.
 *
 * This extension provides Schneider device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Schneider.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Schneider: Any
  get() = object {
      /** Schneider Wave_3 */
      val WAVE_3 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
