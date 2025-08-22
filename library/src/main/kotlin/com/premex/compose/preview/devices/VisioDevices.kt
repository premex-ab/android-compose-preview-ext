package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VISIO device specifications for Android Compose previews.
 *
 * This extension provides VISIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Visio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Visio: Any
  get() = object {
      /** VISIO shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VISIO SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
