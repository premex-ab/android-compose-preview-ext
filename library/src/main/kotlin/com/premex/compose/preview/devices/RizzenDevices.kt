package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RIZZEN device specifications for Android Compose previews.
 *
 * This extension provides RIZZEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rizzen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rizzen: Any
  get() = object {
      /** RIZZEN X1x */
      val X1X = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
