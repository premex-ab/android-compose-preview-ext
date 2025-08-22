package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Turbox device specifications for Android Compose previews.
 *
 * This extension provides Turbox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Turbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Turbox: Any
  get() = object {
      /** Turbox Aqua_II */
      val AQUA_II = "spec:width=800,height=1280,unit=px,dpi=160"

  }
