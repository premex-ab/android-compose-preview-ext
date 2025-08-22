package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iDevice device specifications for Android Compose previews.
 *
 * This extension provides iDevice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Idevice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Idevice: Any
  get() = object {
      /** iDevice Uzbekistan */
      val UZBEKISTAN = "spec:width=720,height=1520,unit=px,dpi=320"

  }
