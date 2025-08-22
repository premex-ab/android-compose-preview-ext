package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Senter device specifications for Android Compose previews.
 *
 * This extension provides Senter device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Senter.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Senter: Any
  get() = object {
      /** Senter S917V9 */
      val S917V9 = "spec:width=1200,height=1920,unit=px,dpi=480"

  }
