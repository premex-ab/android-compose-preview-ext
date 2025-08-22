package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Foxtel device specifications for Android Compose previews.
 *
 * This extension provides Foxtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Foxtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Foxtel: Any
  get() = object {
      /** Foxtel dwt765fxt */
      val DWT765FXT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
