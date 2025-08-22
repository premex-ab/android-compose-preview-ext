package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GLOBAL_3 device specifications for Android Compose previews.
 *
 * This extension provides GLOBAL_3 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GLOBAL3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GLOBAL3: Any
  get() = object {
      /** GLOBAL_3 Global3_B01 */
      val GLOBAL3_B01 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
