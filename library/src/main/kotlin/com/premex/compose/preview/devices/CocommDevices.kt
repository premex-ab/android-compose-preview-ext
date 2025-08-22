package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * cocomm device specifications for Android Compose previews.
 *
 * This extension provides cocomm device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cocomm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cocomm: Any
  get() = object {
      /** cocomm F780 */
      val F780 = "spec:width=480,height=854,unit=px,dpi=200"

  }
