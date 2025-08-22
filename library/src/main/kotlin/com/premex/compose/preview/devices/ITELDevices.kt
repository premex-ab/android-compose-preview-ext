package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ITEL device specifications for Android Compose previews.
 *
 * This extension provides ITEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ITEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ITEL: Any
  get() = object {
      /** ITEL stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
