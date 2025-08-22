package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RINDO device specifications for Android Compose previews.
 *
 * This extension provides RINDO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rindo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rindo: Any
  get() = object {
      /** RINDO lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
