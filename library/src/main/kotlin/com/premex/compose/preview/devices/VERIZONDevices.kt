package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VERIZON device specifications for Android Compose previews.
 *
 * This extension provides VERIZON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VERIZON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VERIZON: Any
  get() = object {
      /** VERIZON QMV7A */
      val QMV7A = "spec:width=800,height=1280,unit=px,dpi=213"

  }
