package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Funai device specifications for Android Compose previews.
 *
 * This extension provides Funai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Funai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Funai: Any
  get() = object {
      /** Funai cocina */
      val COCINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Funai freesia */
      val FREESIA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Funai peach */
      val PEACH = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
