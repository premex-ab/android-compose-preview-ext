package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wave8RedNougat device specifications for Android Compose previews.
 *
 * This extension provides Wave8RedNougat device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wave8RedNougat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wave8RedNougat: Any
  get() = object {
      /** Wave8RedNougat WV8R_N */
      val WV8R_N = "spec:width=1536,height=2048,unit=px,dpi=320"

  }
