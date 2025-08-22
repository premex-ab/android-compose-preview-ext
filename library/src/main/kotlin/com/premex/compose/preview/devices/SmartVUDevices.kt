package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SmartVU device specifications for Android Compose previews.
 *
 * This extension provides SmartVU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SmartVU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SmartVU: Any
  get() = object {
      /** SmartVU IAD */
      val IAD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SmartVU ICN */
      val ICN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
