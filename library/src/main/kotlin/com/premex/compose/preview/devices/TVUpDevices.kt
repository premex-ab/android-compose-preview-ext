package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVUp device specifications for Android Compose previews.
 *
 * This extension provides TVUp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVUp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVUp: Any
  get() = object {
      /** TVUp SEI300T */
      val SEI300T = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
