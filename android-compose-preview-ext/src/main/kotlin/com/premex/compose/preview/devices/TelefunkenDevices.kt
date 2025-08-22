package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Telefunken device specifications for Android Compose previews.
 *
 * This extension provides Telefunken device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telefunken.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telefunken: Any
  get() = object {
      /** Telefunken shandao */
      val SHANDAO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Telefunken shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
