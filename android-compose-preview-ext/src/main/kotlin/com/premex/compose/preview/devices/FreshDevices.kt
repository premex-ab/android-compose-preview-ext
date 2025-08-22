package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FRESH device specifications for Android Compose previews.
 *
 * This extension provides FRESH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fresh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fresh: Any
  get() = object {
      /** FRESH R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** FRESH shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** FRESH SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
