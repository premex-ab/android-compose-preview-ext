package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Optoma device specifications for Android Compose previews.
 *
 * This extension provides Optoma device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Optoma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Optoma: Any
  get() = object {
      /** Optoma rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
