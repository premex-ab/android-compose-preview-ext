package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XREAL device specifications for Android Compose previews.
 *
 * This extension provides XREAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XREAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XREAL: Any
  get() = object {
      /** XREAL X4000 */
      val X4000 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
