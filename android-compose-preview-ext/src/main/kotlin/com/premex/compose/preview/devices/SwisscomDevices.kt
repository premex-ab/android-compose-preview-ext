package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Swisscom device specifications for Android Compose previews.
 *
 * This extension provides Swisscom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swisscom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swisscom: Any
  get() = object {
      /** Swisscom IP1800 */
      val IP1800 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Swisscom IP2000 */
      val IP2000 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** Swisscom IP2300 */
      val IP2300 = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
