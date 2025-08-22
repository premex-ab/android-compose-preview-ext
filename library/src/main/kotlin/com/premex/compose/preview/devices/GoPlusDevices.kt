package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GoPlus device specifications for Android Compose previews.
 *
 * This extension provides GoPlus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GoPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GoPlus: Any
  get() = object {
      /** GoPlus SEI700STL */
      val SEI700STL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
