package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BTC device specifications for Android Compose previews.
 *
 * This extension provides BTC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BTC: Any
  get() = object {
      /** BTC S5548 */
      val S5548 = "spec:width=480,height=960,unit=px,dpi=160"

  }
