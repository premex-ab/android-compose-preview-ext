package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * V7 device specifications for Android Compose previews.
 *
 * This extension provides V7 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.V7.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.V7: Any
  get() = object {
      /** V7 BUV7TBLT10A */
      val BUV7TBLT10A = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** V7 rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
