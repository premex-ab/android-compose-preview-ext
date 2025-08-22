package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Swissvoice device specifications for Android Compose previews.
 *
 * This extension provides Swissvoice device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swissvoice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swissvoice: Any
  get() = object {
      /** Swissvoice G50 */
      val G50 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
