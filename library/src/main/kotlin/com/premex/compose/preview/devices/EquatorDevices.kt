package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Equator device specifications for Android Compose previews.
 *
 * This extension provides Equator device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Equator.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Equator: Any
  get() = object {
      /** Equator Axis */
      val AXIS = "spec:width=720,height=1440,unit=px,dpi=320"

  }
