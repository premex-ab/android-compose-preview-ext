package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * oneplus device specifications for Android Compose previews.
 *
 * This extension provides oneplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oneplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oneplus: Any
  get() = object {
      /** oneplus A0001 */
      val A0001 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
