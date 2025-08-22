package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUNAR device specifications for Android Compose previews.
 *
 * This extension provides LUNAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LUNAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LUNAR: Any
  get() = object {
      /** LUNAR Lunar_Eclipse_L1 */
      val LUNAR_ECLIPSE_L1 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
