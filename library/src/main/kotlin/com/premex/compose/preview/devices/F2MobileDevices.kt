package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * F2Mobile device specifications for Android Compose previews.
 *
 * This extension provides F2Mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.F2Mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.F2Mobile: Any
  get() = object {
      /** F2Mobile LT18 */
      val LT18 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
