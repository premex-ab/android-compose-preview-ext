package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Swosh device specifications for Android Compose previews.
 *
 * This extension provides Swosh device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swosh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swosh: Any
  get() = object {
      /** Swosh longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Swosh samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
