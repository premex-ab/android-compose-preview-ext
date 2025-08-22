package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IQUAL device specifications for Android Compose previews.
 *
 * This extension provides IQUAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IQUAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IQUAL: Any
  get() = object {
      /** IQUAL T10W2 */
      val T10W2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
