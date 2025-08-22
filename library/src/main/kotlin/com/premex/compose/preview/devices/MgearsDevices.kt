package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mgears device specifications for Android Compose previews.
 *
 * This extension provides Mgears device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mgears.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mgears: Any
  get() = object {
      /** Mgears Mstick4-EEA */
      val MSTICK4_EEA = "spec:width=800,height=1280,unit=px,dpi=230"

  }
