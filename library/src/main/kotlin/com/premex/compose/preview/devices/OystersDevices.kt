package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Oysters device specifications for Android Compose previews.
 *
 * This extension provides Oysters device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oysters.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oysters: Any
  get() = object {
      /** Oysters T72HM3G */
      val T72HM3G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
