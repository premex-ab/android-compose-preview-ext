package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPECKTRON device specifications for Android Compose previews.
 *
 * This extension provides SPECKTRON device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SPECKTRON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPECKTRON: Any
  get() = object {
      /** SPECKTRON UDX_series */
      val UDX_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
