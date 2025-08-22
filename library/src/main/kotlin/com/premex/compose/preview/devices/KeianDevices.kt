package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Keian device specifications for Android Compose previews.
 *
 * This extension provides Keian device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Keian.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Keian: Any
  get() = object {
      /** Keian KI-Z101E */
      val KI_Z101E = "spec:width=800,height=1280,unit=px,dpi=213"

  }
