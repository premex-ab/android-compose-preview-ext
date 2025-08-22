package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAWINK device specifications for Android Compose previews.
 *
 * This extension provides SAWINK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sawink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sawink: Any
  get() = object {
      /** SAWINK T10 */
      val T10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
