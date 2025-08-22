package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HORIZON device specifications for Android Compose previews.
 *
 * This extension provides HORIZON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HORIZON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HORIZON: Any
  get() = object {
      /** HORIZON Interactive_White_Board */
      val INTERACTIVE_WHITE_BOARD = "spec:width=2160,height=3840,unit=px,dpi=640"

  }
