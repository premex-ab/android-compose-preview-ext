package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Delephas device specifications for Android Compose previews.
 *
 * This extension provides Delephas device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Delephas.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Delephas: Any
  get() = object {
      /** Delephas seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
