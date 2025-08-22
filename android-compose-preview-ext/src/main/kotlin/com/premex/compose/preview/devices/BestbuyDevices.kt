package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * bestbuy device specifications for Android Compose previews.
 *
 * This extension provides bestbuy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bestbuy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bestbuy: Any
  get() = object {
      /** bestbuy ns_14t002 */
      val NS_14T002 = "spec:width=768,height=1024,unit=px,dpi=160"

  }
