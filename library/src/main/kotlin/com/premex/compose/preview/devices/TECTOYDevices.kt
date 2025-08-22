package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECTOY device specifications for Android Compose previews.
 *
 * This extension provides TECTOY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECTOY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECTOY: Any
  get() = object {
      /** TECTOY TokyoPro */
      val TOKYOPRO = "spec:width=720,height=1520,unit=px,dpi=320"

  }
