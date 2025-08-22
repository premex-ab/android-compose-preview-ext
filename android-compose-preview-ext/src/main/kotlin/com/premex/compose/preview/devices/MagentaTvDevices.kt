package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Magenta-TV device specifications for Android Compose previews.
 *
 * This extension provides Magenta-TV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MagentaTv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MagentaTv: Any
  get() = object {
      /** Magenta-TV DV6067Y_TVStick */
      val DV6067Y_TVSTICK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Magenta-TV HY44G */
      val HY44G = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
