package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JHZL device specifications for Android Compose previews.
 *
 * This extension provides JHZL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JHZL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JHZL: Any
  get() = object {
      /** JHZL J101-EEA */
      val J101_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
