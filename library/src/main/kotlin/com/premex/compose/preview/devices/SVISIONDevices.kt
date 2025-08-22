package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SVISION device specifications for Android Compose previews.
 *
 * This extension provides SVISION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SVISION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SVISION: Any
  get() = object {
      /** SVISION martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SVISION stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
