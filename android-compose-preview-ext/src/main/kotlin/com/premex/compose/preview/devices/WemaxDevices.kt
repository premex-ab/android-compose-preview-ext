package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wemax device specifications for Android Compose previews.
 *
 * This extension provides Wemax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wemax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wemax: Any
  get() = object {
      /** Wemax tianshan */
      val TIANSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
