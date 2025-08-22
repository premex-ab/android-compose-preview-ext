package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TurboX device specifications for Android Compose previews.
 *
 * This extension provides TurboX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Turbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Turbox: Any
  get() = object {
      /** TurboX Mercury */
      val MERCURY = "spec:width=720,height=1440,unit=px,dpi=320"

  }
