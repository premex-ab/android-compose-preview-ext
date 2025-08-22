package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yokoscan device specifications for Android Compose previews.
 *
 * This extension provides Yokoscan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yokoscan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yokoscan: Any
  get() = object {
      /** Yokoscan TC60_EEA */
      val TC60_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

  }
