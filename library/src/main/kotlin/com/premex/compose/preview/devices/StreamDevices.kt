package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Stream device specifications for Android Compose previews.
 *
 * This extension provides Stream device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stream.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stream: Any
  get() = object {
      /** Stream DV8555-Altice */
      val DV8555_ALTICE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
