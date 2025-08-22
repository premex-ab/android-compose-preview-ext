package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Movistar device specifications for Android Compose previews.
 *
 * This extension provides Movistar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movistar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movistar: Any
  get() = object {
      /** Movistar hwt101 */
      val HWT101 = "spec:width=752,height=1280,unit=px,dpi=160"

  }
