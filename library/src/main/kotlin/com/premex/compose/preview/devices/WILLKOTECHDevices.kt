package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WILLKOTECH device specifications for Android Compose previews.
 *
 * This extension provides WILLKOTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WILLKOTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WILLKOTECH: Any
  get() = object {
      /** WILLKOTECH WK1863L */
      val WK1863L = "spec:width=800,height=1280,unit=px,dpi=160"

  }
