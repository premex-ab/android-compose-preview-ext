package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sceptre device specifications for Android Compose previews.
 *
 * This extension provides Sceptre device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sceptre.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sceptre: Any
  get() = object {
      /** Sceptre gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Sceptre kanda */
      val KANDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
