package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Digi_R2 device specifications for Android Compose previews.
 *
 * This extension provides Digi_R2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DigiR2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DigiR2: Any
  get() = object {
      /** Digi_R2 Digi_R2 */
      val DIGI_R2 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
