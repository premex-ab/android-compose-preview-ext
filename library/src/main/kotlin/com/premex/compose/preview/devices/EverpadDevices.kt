package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Everpad device specifications for Android Compose previews.
 *
 * This extension provides Everpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Everpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Everpad: Any
  get() = object {
      /** Everpad VORTEX_V10 */
      val VORTEX_V10 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
