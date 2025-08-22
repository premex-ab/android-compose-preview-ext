package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * I-LIFE device specifications for Android Compose previews.
 *
 * This extension provides I-LIFE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ILife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ILife: Any
  get() = object {
      /** I-LIFE MISA */
      val MISA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
