package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOTWIRE device specifications for Android Compose previews.
 *
 * This extension provides HOTWIRE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hotwire.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hotwire: Any
  get() = object {
      /** HOTWIRE uiw4054hwc */
      val UIW4054HWC = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
