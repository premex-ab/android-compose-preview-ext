package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Indibox device specifications for Android Compose previews.
 *
 * This extension provides Indibox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Indibox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Indibox: Any
  get() = object {
      /** Indibox DV8219 */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
