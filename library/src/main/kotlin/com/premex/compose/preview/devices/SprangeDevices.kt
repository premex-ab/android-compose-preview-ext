package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPRANGE device specifications for Android Compose previews.
 *
 * This extension provides SPRANGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sprange.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sprange: Any
  get() = object {
      /** SPRANGE Sprange_L8 */
      val SPRANGE_L8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
