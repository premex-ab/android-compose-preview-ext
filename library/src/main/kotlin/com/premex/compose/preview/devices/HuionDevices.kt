package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Huion device specifications for Android Compose previews.
 *
 * This extension provides Huion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Huion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Huion: Any
  get() = object {
      /** Huion KamvasSlate10 */
      val KAMVASSLATE10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Huion KamvasSlate10_EEA */
      val KAMVASSLATE10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
