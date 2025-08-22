package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mediabox device specifications for Android Compose previews.
 *
 * This extension provides Mediabox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mediabox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mediabox: Any
  get() = object {
      /** Mediabox DV8235 */
      val DV8235 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Mediabox JFK */
      val JFK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
