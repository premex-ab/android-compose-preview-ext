package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JapanTaxi device specifications for Android Compose previews.
 *
 * This extension provides JapanTaxi device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Japantaxi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Japantaxi: Any
  get() = object {
      /** JapanTaxi IRIS_ITAB05 */
      val IRIS_ITAB05 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
