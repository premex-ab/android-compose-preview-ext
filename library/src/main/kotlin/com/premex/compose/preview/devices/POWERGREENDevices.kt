package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POWER-GREEN device specifications for Android Compose previews.
 *
 * This extension provides POWER-GREEN device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POWERGREEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POWERGREEN: Any
  get() = object {
      /** POWER-GREEN stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** POWER-GREEN zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
