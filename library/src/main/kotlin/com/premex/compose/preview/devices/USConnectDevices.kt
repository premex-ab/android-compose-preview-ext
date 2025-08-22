package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * USConnect device specifications for Android Compose previews.
 *
 * This extension provides USConnect device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.USConnect.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.USConnect: Any
  get() = object {
      /** USConnect VT10M2 */
      val VT10M2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
