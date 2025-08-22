package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * General_luxe device specifications for Android Compose previews.
 *
 * This extension provides General_luxe device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GeneralLuxe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GeneralLuxe: Any
  get() = object {
      /** General_luxe Shahin_III */
      val SHAHIN_III = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
