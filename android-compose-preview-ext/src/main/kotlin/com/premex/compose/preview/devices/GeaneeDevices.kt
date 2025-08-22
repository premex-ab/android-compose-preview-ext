package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * geanee device specifications for Android Compose previews.
 *
 * This extension provides geanee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geanee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geanee: Any
  get() = object {
      /** geanee ADP-503G */
      val ADP_503G = "spec:width=540,height=960,unit=px,dpi=240"

  }
