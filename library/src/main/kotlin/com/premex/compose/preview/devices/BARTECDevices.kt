package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BARTEC device specifications for Android Compose previews.
 *
 * This extension provides BARTEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BARTEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BARTEC: Any
  get() = object {
      /** BARTEC PixaviPhone */
      val PIXAVIPHONE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** BARTEC SP9EX1 */
      val SP9EX1 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
