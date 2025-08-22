package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRIE device specifications for Android Compose previews.
 *
 * This extension provides IRIE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Irie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Irie: Any
  get() = object {
      /** IRIE FFF-TAB10H */
      val FFF_TAB10H = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
