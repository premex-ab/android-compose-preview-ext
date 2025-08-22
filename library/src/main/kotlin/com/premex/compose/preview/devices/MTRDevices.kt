package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MTR device specifications for Android Compose previews.
 *
 * This extension provides MTR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MTR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MTR: Any
  get() = object {
      /** MTR MT9 */
      val MT9 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
