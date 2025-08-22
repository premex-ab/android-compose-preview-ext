package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pastigio device specifications for Android Compose previews.
 *
 * This extension provides Pastigio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pastigio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pastigio: Any
  get() = object {
      /** Pastigio M10T2_P15 */
      val M10T2_P15 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
