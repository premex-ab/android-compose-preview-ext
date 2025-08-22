package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ESOL device specifications for Android Compose previews.
 *
 * This extension provides ESOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Esol.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Esol: Any
  get() = object {
      /** ESOL Interactive_White_Board */
      val INTERACTIVE_WHITE_BOARD = "spec:width=2160,height=3840,unit=px,dpi=640"

      /** ESOL rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
