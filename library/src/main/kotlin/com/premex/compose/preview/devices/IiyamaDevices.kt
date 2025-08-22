package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iiyama device specifications for Android Compose previews.
 *
 * This extension provides iiyama device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iiyama.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iiyama: Any
  get() = object {
      /** iiyama rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** iiyama TEXX13A */
      val TEXX13A = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
