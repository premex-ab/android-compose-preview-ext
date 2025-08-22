package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Newline device specifications for Android Compose previews.
 *
 * This extension provides Newline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newline: Any
  get() = object {
      /** Newline rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Newline velvet */
      val VELVET = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** Newline Z24 */
      val Z24 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
