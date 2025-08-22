package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Elista device specifications for Android Compose previews.
 *
 * This extension provides Elista device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elista.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elista: Any
  get() = object {
      /** Elista lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
