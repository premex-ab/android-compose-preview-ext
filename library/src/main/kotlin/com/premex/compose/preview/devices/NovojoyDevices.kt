package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOVOJOY device specifications for Android Compose previews.
 *
 * This extension provides NOVOJOY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Novojoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Novojoy: Any
  get() = object {
      /** NOVOJOY NV10 */
      val NV10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
