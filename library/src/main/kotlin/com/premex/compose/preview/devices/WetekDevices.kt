package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WeTek device specifications for Android Compose previews.
 *
 * This extension provides WeTek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wetek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wetek: Any
  get() = object {
      /** WeTek wh220 */
      val WH220 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
