package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TRANSVISION device specifications for Android Compose previews.
 *
 * This extension provides TRANSVISION device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Transvision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Transvision: Any
  get() = object {
      /** TRANSVISION SEI500TR */
      val SEI500TR = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
