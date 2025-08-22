package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * yuntab device specifications for Android Compose previews.
 *
 * This extension provides yuntab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yuntab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yuntab: Any
  get() = object {
      /** yuntab D107 */
      val D107 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
