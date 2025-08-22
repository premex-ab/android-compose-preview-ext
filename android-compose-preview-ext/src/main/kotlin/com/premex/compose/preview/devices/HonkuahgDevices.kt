package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HONKUAHG device specifications for Android Compose previews.
 *
 * This extension provides HONKUAHG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Honkuahg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Honkuahg: Any
  get() = object {
      /** HONKUAHG EV10 */
      val EV10 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
