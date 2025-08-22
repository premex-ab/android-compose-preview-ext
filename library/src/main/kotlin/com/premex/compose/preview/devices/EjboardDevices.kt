package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EJBOARD device specifications for Android Compose previews.
 *
 * This extension provides EJBOARD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ejboard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ejboard: Any
  get() = object {
      /** EJBOARD rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
