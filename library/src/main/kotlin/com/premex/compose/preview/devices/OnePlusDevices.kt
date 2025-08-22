package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OnePlus device specifications for Android Compose previews.
 *
 * This extension provides OnePlus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OnePlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OnePlus: Any
  get() = object {
      /** OnePlus 12 */
      val _12 = "spec:width=1440,height=3168,unit=px,dpi=510"

      /** OnePlus 12R */
      val _12R = "spec:width=1240,height=2772,unit=px,dpi=450"

  }
