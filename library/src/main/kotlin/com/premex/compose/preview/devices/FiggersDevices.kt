package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Figgers device specifications for Android Compose previews.
 *
 * This extension provides Figgers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Figgers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Figgers: Any
  get() = object {
      /** Figgers Figgers_DragonX */
      val FIGGERS_DRAGONX = "spec:width=720,height=1600,unit=px,dpi=320"

  }
