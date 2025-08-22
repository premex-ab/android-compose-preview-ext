package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ckypad device specifications for Android Compose previews.
 *
 * This extension provides Ckypad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ckypad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ckypad: Any
  get() = object {
      /** Ckypad Cpad10EEA */
      val CPAD10EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
