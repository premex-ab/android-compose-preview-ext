package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STAR device specifications for Android Compose previews.
 *
 * This extension provides STAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Star.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Star: Any
  get() = object {
      /** STAR Y11 */
      val Y11 = "spec:width=480,height=800,unit=px,dpi=240"

  }
