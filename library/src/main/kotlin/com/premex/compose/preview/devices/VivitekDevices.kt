package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vivitek device specifications for Android Compose previews.
 *
 * This extension provides Vivitek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vivitek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vivitek: Any
  get() = object {
      /** Vivitek rk3576_u */
      val RK3576_U = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
