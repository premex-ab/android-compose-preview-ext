package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Theham device specifications for Android Compose previews.
 *
 * This extension provides Theham device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Theham.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Theham: Any
  get() = object {
      /** Theham huangshan */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Theham longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Theham sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
