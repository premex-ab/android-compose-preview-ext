package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVcore device specifications for Android Compose previews.
 *
 * This extension provides TVcore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVcore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVcore: Any
  get() = object {
      /** TVcore ts401 */
      val TS401 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
