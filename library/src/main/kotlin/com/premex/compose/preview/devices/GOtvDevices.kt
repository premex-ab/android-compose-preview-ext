package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOtv device specifications for Android Compose previews.
 *
 * This extension provides GOtv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOtv: Any
  get() = object {
      /** GOtv HND */
      val HND = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
