package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BAKEN device specifications for Android Compose previews.
 *
 * This extension provides BAKEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BAKEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BAKEN: Any
  get() = object {
      /** BAKEN M10_A03 */
      val M10_A03 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
