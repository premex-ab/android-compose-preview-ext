package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Canal device specifications for Android Compose previews.
 *
 * This extension provides Canal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Canal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Canal: Any
  get() = object {
      /** Canal canal_sat_bcm */
      val CANAL_SAT_BCM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
