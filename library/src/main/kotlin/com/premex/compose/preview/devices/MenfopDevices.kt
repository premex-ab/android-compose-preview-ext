package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * menfop device specifications for Android Compose previews.
 *
 * This extension provides menfop device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Menfop.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Menfop: Any
  get() = object {
      /** menfop HaierP8B */
      val HAIERP8B = "spec:width=800,height=1280,unit=px,dpi=160"

  }
