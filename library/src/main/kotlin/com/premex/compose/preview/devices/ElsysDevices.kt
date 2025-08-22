package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Elsys device specifications for Android Compose previews.
 *
 * This extension provides Elsys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elsys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elsys: Any
  get() = object {
      /** Elsys tai */
      val TAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
