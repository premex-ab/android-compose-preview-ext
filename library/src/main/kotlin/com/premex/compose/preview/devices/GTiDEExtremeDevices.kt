package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-TiDE_Extreme device specifications for Android Compose previews.
 *
 * This extension provides G-TiDE_Extreme device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTiDEExtreme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTiDEExtreme: Any
  get() = object {
      /** G-TiDE_Extreme EX760 */
      val EX760 = "spec:width=800,height=1280,unit=px,dpi=180"

  }
