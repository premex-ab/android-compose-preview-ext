package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CLASSPRO device specifications for Android Compose previews.
 *
 * This extension provides CLASSPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Classpro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Classpro: Any
  get() = object {
      /** CLASSPRO redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
