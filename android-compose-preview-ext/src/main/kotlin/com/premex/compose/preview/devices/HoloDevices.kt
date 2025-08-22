package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Holo device specifications for Android Compose previews.
 *
 * This extension provides Holo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Holo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Holo: Any
  get() = object {
      /** Holo XPLAY3 */
      val XPLAY3 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
