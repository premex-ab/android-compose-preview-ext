package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * helio device specifications for Android Compose previews.
 *
 * This extension provides helio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Helio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Helio: Any
  get() = object {
      /** helio helio_40 */
      val HELIO_40 = "spec:width=720,height=1604,unit=px,dpi=280"

      /** helio helio_50 */
      val HELIO_50 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
