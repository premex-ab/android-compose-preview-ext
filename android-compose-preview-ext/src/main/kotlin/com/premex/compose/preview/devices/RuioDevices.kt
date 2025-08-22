package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ruio device specifications for Android Compose previews.
 *
 * This extension provides Ruio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ruio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ruio: Any
  get() = object {
      /** Ruio A870 */
      val A870 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Ruio Ruio_i7Ultra */
      val RUIO_I7ULTRA = "spec:width=600,height=1024,unit=px,dpi=213"

  }
