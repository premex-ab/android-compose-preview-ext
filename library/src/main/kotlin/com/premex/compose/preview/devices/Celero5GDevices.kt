package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Celero5G device specifications for Android Compose previews.
 *
 * This extension provides Celero5G device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Celero5G.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Celero5G: Any
  get() = object {
      /** Celero5G Jupiter */
      val JUPITER = "spec:width=720,height=1600,unit=px,dpi=300"

  }
