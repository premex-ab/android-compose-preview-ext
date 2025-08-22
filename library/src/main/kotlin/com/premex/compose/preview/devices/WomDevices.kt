package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WOM device specifications for Android Compose previews.
 *
 * This extension provides WOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wom: Any
  get() = object {
      /** WOM SEI500W */
      val SEI500W = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
