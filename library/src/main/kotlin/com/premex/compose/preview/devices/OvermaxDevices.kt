package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Overmax device specifications for Android Compose previews.
 *
 * This extension provides Overmax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Overmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Overmax: Any
  get() = object {
      /** Overmax Livecore7032 */
      val LIVECORE7032 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Overmax OV10273G */
      val OV10273G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Overmax OV10274G */
      val OV10274G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Overmax OV-Qualcore-1023-3G */
      val OV_QUALCORE_1023_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Overmax OV-Qualcore-7023-3G */
      val OV_QUALCORE_7023_3G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
