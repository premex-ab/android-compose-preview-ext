package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Readly device specifications for Android Compose previews.
 *
 * This extension provides Readly device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Readly.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Readly: Any
  get() = object {
      /** Readly ReadlyReaderOne */
      val READLYREADERONE = "spec:width=800,height=1280,unit=px,dpi=200"

  }
