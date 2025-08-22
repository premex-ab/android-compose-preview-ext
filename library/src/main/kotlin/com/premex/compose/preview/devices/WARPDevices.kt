package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WARP device specifications for Android Compose previews.
 *
 * This extension provides WARP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WARP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WARP: Any
  get() = object {
      /** WARP TAB-WP11 */
      val TAB_WP11 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
