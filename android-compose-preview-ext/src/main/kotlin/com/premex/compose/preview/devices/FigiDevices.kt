package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FiGi device specifications for Android Compose previews.
 *
 * This extension provides FiGi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Figi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Figi: Any
  get() = object {
      /** FiGi Fj */
      val FJ = "spec:width=600,height=1280,unit=px,dpi=300"

      /** FiGi FX */
      val FX = "spec:width=540,height=1132,unit=px,dpi=240"

      /** FiGi G6 */
      val G6 = "spec:width=480,height=960,unit=px,dpi=240"

  }
