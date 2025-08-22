package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Softbank device specifications for Android Compose previews.
 *
 * This extension provides Softbank device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Softbank.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Softbank: Any
  get() = object {
      /** Softbank 501LV */
      val _501LV = "spec:width=800,height=1280,unit=px,dpi=213"

  }
