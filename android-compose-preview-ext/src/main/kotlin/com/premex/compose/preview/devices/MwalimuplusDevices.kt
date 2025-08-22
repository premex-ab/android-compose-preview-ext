package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MwalimuPlus device specifications for Android Compose previews.
 *
 * This extension provides MwalimuPlus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mwalimuplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mwalimuplus: Any
  get() = object {
      /** MwalimuPlus MP01A3G */
      val MP01A3G = "spec:width=800,height=1280,unit=px,dpi=213"

  }
