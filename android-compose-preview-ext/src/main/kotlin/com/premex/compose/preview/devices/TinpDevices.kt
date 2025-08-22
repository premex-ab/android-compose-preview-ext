package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TINP device specifications for Android Compose previews.
 *
 * This extension provides TINP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tinp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tinp: Any
  get() = object {
      /** TINP DV8219 */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TINP DV8330-C */
      val DV8330_C = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
