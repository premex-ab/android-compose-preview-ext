package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Geoelectron device specifications for Android Compose previews.
 *
 * This extension provides Geoelectron device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geoelectron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geoelectron: Any
  get() = object {
      /** Geoelectron P9IV_Handheld */
      val P9IV_HANDHELD = "spec:width=720,height=1280,unit=px,dpi=320"

  }
