package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Shuttle device specifications for Android Compose previews.
 *
 * This extension provides Shuttle device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Shuttle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Shuttle: Any
  get() = object {
      /** Shuttle PNT-7045 */
      val PNT_7045 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
