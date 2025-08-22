package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BESTTAB device specifications for Android Compose previews.
 *
 * This extension provides BESTTAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Besttab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Besttab: Any
  get() = object {
      /** BESTTAB A10 */
      val A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BESTTAB A20 */
      val A20 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
