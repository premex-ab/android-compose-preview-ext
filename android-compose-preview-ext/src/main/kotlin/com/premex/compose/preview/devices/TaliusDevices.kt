package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Talius device specifications for Android Compose previews.
 *
 * This extension provides Talius device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Talius.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Talius: Any
  get() = object {
      /** Talius Zircon_1015 */
      val ZIRCON_1015 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Talius Zircon_1016_4G */
      val ZIRCON_1016_4G = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
