package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cellcomtv device specifications for Android Compose previews.
 *
 * This extension provides Cellcomtv device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cellcomtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cellcomtv: Any
  get() = object {
      /** Cellcomtv SEI800CC */
      val SEI800CC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Cellcomtv tai */
      val TAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
