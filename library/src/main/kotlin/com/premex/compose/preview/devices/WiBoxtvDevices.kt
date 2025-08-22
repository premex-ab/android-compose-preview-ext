package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WiBox-tv device specifications for Android Compose previews.
 *
 * This extension provides WiBox-tv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WiBoxtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WiBoxtv: Any
  get() = object {
      /** WiBox-tv WiBox-tv */
      val WIBOX_TV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
