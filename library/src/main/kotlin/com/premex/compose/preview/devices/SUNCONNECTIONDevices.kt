package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNCONNECTION device specifications for Android Compose previews.
 *
 * This extension provides SUNCONNECTION device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNCONNECTION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNCONNECTION: Any
  get() = object {
      /** SUNCONNECTION SUNTB_01_GY */
      val SUNTB_01_GY = "spec:width=800,height=1280,unit=px,dpi=213"

  }
