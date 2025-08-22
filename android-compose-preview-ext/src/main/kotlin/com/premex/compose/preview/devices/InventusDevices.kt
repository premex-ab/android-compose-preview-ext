package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Inventus device specifications for Android Compose previews.
 *
 * This extension provides Inventus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inventus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inventus: Any
  get() = object {
      /** Inventus Beige */
      val BEIGE = "spec:width=720,height=1612,unit=px,dpi=320"

  }
