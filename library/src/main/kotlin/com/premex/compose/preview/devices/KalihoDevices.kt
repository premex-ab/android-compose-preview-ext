package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * kaliho device specifications for Android Compose previews.
 *
 * This extension provides kaliho device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kaliho.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kaliho: Any
  get() = object {
      /** kaliho H3 */
      val H3 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
