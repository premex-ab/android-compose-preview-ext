package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVplus device specifications for Android Compose previews.
 *
 * This extension provides TVplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tvplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tvplus: Any
  get() = object {
      /** TVplus HP44H */
      val HP44H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
