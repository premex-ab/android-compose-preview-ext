package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LeBest device specifications for Android Compose previews.
 *
 * This extension provides LeBest device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LeBest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LeBest: Any
  get() = object {
      /** LeBest L2 */
      val L2 = "spec:width=720,height=1612,unit=px,dpi=260"

      /** LeBest L3 */
      val L3 = "spec:width=720,height=1604,unit=px,dpi=260"

  }
