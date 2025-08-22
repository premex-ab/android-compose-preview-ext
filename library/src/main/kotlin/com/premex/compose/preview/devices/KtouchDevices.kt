package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * K-touch device specifications for Android Compose previews.
 *
 * This extension provides K-touch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ktouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ktouch: Any
  get() = object {
      /** K-touch Pace_2_Lite */
      val PACE_2_LITE = "spec:width=800,height=1280,unit=px,dpi=240"

  }
