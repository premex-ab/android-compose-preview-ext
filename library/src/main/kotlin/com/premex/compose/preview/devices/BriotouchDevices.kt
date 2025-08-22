package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Briotouch device specifications for Android Compose previews.
 *
 * This extension provides Briotouch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Briotouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Briotouch: Any
  get() = object {
      /** Briotouch ULTRA-PLUS-BR */
      val ULTRA_PLUS_BR = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
