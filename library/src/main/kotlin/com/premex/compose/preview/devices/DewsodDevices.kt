package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DEWSOD device specifications for Android Compose previews.
 *
 * This extension provides DEWSOD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dewsod.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dewsod: Any
  get() = object {
      /** DEWSOD C9 */
      val C9 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
