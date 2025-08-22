package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLESSX device specifications for Android Compose previews.
 *
 * This extension provides BLESSX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blessx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blessx: Any
  get() = object {
      /** BLESSX T4SMODELX */
      val T4SMODELX = "spec:width=442,height=960,unit=px,dpi=200"

  }
