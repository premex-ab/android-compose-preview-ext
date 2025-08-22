package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ruufuuxy device specifications for Android Compose previews.
 *
 * This extension provides Ruufuuxy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ruufuuxy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ruufuuxy: Any
  get() = object {
      /** Ruufuuxy R16Max */
      val R16MAX = "spec:width=800,height=1280,unit=px,dpi=160"

  }
