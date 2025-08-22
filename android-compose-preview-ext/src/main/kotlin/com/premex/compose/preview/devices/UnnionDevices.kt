package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Unnion device specifications for Android Compose previews.
 *
 * This extension provides Unnion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unnion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unnion: Any
  get() = object {
      /** Unnion UN-CT101 */
      val UN_CT101 = "spec:width=800,height=1280,unit=px,dpi=190"

  }
