package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lumitel device specifications for Android Compose previews.
 *
 * This extension provides Lumitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lumitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lumitel: Any
  get() = object {
      /** Lumitel L9502 */
      val L9502 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Lumitel L9503 */
      val L9503 = "spec:width=480,height=960,unit=px,dpi=240"

  }
