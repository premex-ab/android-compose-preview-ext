package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MIKU device specifications for Android Compose previews.
 *
 * This extension provides MIKU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MIKU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MIKU: Any
  get() = object {
      /** MIKU TAB63A */
      val TAB63A = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
