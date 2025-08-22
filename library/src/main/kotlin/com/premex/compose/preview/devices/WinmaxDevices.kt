package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Winmax device specifications for Android Compose previews.
 *
 * This extension provides Winmax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Winmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Winmax: Any
  get() = object {
      /** Winmax X50 */
      val X50 = "spec:width=480,height=960,unit=px,dpi=240"

  }
