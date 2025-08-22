package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SmartEver device specifications for Android Compose previews.
 *
 * This extension provides SmartEver device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SmartEver.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SmartEver: Any
  get() = object {
      /** SmartEver seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SmartEver shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
