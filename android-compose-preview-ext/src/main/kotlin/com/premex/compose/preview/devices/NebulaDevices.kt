package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nebula device specifications for Android Compose previews.
 *
 * This extension provides Nebula device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nebula.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nebula: Any
  get() = object {
      /** Nebula D2140-Cosmos */
      val D2140_COSMOS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Nebula taihang */
      val TAIHANG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
