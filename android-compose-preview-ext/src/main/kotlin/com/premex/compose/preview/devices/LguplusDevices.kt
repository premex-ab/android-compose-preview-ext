package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LGUPlus device specifications for Android Compose previews.
 *
 * This extension provides LGUPlus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lguplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lguplus: Any
  get() = object {
      /** LGUPlus UHD4K */
      val UHD4K = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
