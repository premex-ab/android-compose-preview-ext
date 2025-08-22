package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Turbo device specifications for Android Compose previews.
 *
 * This extension provides Turbo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Turbo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Turbo: Any
  get() = object {
      /** Turbo Turbo_X8 */
      val TURBO_X8 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
