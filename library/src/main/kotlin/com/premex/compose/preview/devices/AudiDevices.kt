package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Audi device specifications for Android Compose previews.
 *
 * This extension provides Audi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Audi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Audi: Any
  get() = object {
      /** Audi sdis1 */
      val SDIS1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
