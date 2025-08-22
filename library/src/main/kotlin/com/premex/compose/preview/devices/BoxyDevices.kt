package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BOXY device specifications for Android Compose previews.
 *
 * This extension provides BOXY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Boxy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Boxy: Any
  get() = object {
      /** BOXY YYC */
      val YYC = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
