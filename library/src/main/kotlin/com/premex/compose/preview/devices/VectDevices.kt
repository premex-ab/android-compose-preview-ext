package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VECT device specifications for Android Compose previews.
 *
 * This extension provides VECT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vect.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vect: Any
  get() = object {
      /** VECT rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
