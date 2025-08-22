package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mola_TV device specifications for Android Compose previews.
 *
 * This extension provides Mola_TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MolaTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MolaTV: Any
  get() = object {
      /** Mola_TV DV8235_P */
      val DV8235_P = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
