package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IZZI device specifications for Android Compose previews.
 *
 * This extension provides IZZI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Izzi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Izzi: Any
  get() = object {
      /** IZZI B820C-A15_ZTE */
      val B820C_A15_ZTE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** IZZI B866V2Fi */
      val B866V2FI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
