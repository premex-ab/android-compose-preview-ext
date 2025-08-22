package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JSW device specifications for Android Compose previews.
 *
 * This extension provides JSW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jsw.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jsw: Any
  get() = object {
      /** JSW elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
