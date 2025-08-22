package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QUATRO device specifications for Android Compose previews.
 *
 * This extension provides QUATRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quatro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quatro: Any
  get() = object {
      /** QUATRO Quatro_8 */
      val QUATRO_8 = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
