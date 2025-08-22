package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maxvi device specifications for Android Compose previews.
 *
 * This extension provides Maxvi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxvi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxvi: Any
  get() = object {
      /** Maxvi MS502_Orion */
      val MS502_ORION = "spec:width=480,height=960,unit=px,dpi=240"

  }
