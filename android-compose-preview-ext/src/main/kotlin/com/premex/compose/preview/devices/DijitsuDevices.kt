package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIJITSU device specifications for Android Compose previews.
 *
 * This extension provides DIJITSU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dijitsu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dijitsu: Any
  get() = object {
      /** DIJITSU hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DIJITSU Smart_A11s */
      val SMART_A11S = "spec:width=720,height=1600,unit=px,dpi=320"

  }
