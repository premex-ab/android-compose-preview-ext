package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NT device specifications for Android Compose previews.
 *
 * This extension provides NT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nt: Any
  get() = object {
      /** NT HP40A */
      val HP40A = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
