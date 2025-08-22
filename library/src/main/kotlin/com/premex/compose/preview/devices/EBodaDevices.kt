package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * E-BODA device specifications for Android Compose previews.
 *
 * This extension provides E-BODA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EBoda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EBoda: Any
  get() = object {
      /** E-BODA Eclipse_G400M */
      val ECLIPSE_G400M = "spec:width=480,height=800,unit=px,dpi=240"

  }
