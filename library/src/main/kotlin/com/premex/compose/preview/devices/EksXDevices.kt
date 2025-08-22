package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eksX device specifications for Android Compose previews.
 *
 * This extension provides eksX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EksX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EksX: Any
  get() = object {
      /** eksX X6 */
      val X6 = "spec:width=480,height=960,unit=px,dpi=213"

  }
