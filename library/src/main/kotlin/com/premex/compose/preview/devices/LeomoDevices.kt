package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LEOMO device specifications for Android Compose previews.
 *
 * This extension provides LEOMO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Leomo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Leomo: Any
  get() = object {
      /** LEOMO LMS */
      val LMS = "spec:width=240,height=400,unit=px,dpi=120"

  }
