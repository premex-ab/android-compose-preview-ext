package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YIKEMI device specifications for Android Compose previews.
 *
 * This extension provides YIKEMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YIKEMI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YIKEMI: Any
  get() = object {
      /** YIKEMI Pad6_Plus_EEA */
      val PAD6_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
