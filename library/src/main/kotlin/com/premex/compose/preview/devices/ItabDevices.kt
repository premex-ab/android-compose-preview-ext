package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iTAB device specifications for Android Compose previews.
 *
 * This extension provides iTAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Itab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Itab: Any
  get() = object {
      /** iTAB iTAB-A1 */
      val ITAB_A1 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
