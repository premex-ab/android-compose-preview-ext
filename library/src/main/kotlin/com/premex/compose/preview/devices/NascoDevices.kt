package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nasco device specifications for Android Compose previews.
 *
 * This extension provides Nasco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nasco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nasco: Any
  get() = object {
      /** Nasco Power_Plus */
      val POWER_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
