package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Haoqin device specifications for Android Compose previews.
 *
 * This extension provides Haoqin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Haoqin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Haoqin: Any
  get() = object {
      /** Haoqin SpaceTab_H20 */
      val SPACETAB_H20 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Haoqin SpaceTab_H20_EEA */
      val SPACETAB_H20_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
