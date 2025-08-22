package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Transvision device specifications for Android Compose previews.
 *
 * This extension provides Transvision device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Transvision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Transvision: Any
  get() = object {
      /** Transvision UHD_I56AD_TRV */
      val UHD_I56AD_TRV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Transvision USB6_IR80 */
      val USB6_IR80 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
