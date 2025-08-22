package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * tbroad device specifications for Android Compose previews.
 *
 * This extension provides tbroad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tbroad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tbroad: Any
  get() = object {
      /** tbroad tmau400 */
      val TMAU400 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
