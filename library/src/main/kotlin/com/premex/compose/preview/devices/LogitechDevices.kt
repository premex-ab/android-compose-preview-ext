package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Logitech device specifications for Android Compose previews.
 *
 * This extension provides Logitech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Logitech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Logitech: Any
  get() = object {
      /** Logitech GR0006 */
      val GR0006 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
