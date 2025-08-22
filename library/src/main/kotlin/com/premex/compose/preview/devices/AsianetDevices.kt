package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Asianet device specifications for Android Compose previews.
 *
 * This extension provides Asianet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Asianet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Asianet: Any
  get() = object {
      /** Asianet D8109N */
      val D8109N = "spec:width=720,height=1280,unit=px,dpi=213"

  }
