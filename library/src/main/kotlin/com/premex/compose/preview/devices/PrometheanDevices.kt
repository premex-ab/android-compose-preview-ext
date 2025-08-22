package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Promethean device specifications for Android Compose previews.
 *
 * This extension provides Promethean device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Promethean.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Promethean: Any
  get() = object {
      /** Promethean OPS-A2 */
      val OPS_A2 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Promethean XM3566D */
      val XM3566D = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
