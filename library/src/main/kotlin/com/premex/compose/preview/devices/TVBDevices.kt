package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVB device specifications for Android Compose previews.
 *
 * This extension provides TVB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVB: Any
  get() = object {
      /** TVB A151 */
      val A151 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TVB A20 */
      val A20 = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
