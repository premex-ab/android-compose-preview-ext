package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lincplus device specifications for Android Compose previews.
 *
 * This extension provides Lincplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lincplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lincplus: Any
  get() = object {
      /** Lincplus T3_US */
      val T3_US = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
