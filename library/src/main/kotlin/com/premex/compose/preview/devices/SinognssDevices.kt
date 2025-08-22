package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SinoGNSS device specifications for Android Compose previews.
 *
 * This extension provides SinoGNSS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sinognss.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sinognss: Any
  get() = object {
      /** SinoGNSS R60 */
      val R60 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
