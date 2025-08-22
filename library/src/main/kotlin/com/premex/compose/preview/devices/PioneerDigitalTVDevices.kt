package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pioneer_Digital_TV device specifications for Android Compose previews.
 *
 * This extension provides Pioneer_Digital_TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PioneerDigitalTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PioneerDigitalTV: Any
  get() = object {
      /** Pioneer_Digital_TV DV8535-KIP */
      val DV8535_KIP = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
