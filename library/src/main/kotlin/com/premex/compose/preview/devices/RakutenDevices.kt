package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rakuten device specifications for Android Compose previews.
 *
 * This extension provides Rakuten device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rakuten.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rakuten: Any
  get() = object {
      /** Rakuten C330 */
      val C330 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Rakuten gaea */
      val GAEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Rakuten P710 */
      val P710 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Rakuten P780 */
      val P780 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
