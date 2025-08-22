package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * X-PREMIUM device specifications for Android Compose previews.
 *
 * This extension provides X-PREMIUM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XPREMIUM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XPREMIUM: Any
  get() = object {
      /** X-PREMIUM X1 */
      val X1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
