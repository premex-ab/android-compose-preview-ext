package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Thuraya device specifications for Android Compose previews.
 *
 * This extension provides Thuraya device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Thuraya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Thuraya: Any
  get() = object {
      /** Thuraya X5-Touch */
      val X5_TOUCH = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
