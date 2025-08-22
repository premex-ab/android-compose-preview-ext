package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SQ device specifications for Android Compose previews.
 *
 * This extension provides SQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SQ: Any
  get() = object {
      /** SQ Hope10_Max */
      val HOPE10_MAX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SQ Hope8_Max */
      val HOPE8_MAX = "spec:width=800,height=1280,unit=px,dpi=204"

  }
