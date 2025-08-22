package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVOPRO device specifications for Android Compose previews.
 *
 * This extension provides EVOPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evopro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evopro: Any
  get() = object {
      /** EVOPRO SEI500EV */
      val SEI500EV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
