package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Freemobile device specifications for Android Compose previews.
 *
 * This extension provides Freemobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Freemobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Freemobile: Any
  get() = object {
      /** Freemobile FS500 */
      val FS500 = "spec:width=540,height=960,unit=px,dpi=240"

  }
