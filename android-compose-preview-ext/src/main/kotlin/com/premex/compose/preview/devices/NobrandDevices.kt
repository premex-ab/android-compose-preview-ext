package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOBRAND device specifications for Android Compose previews.
 *
 * This extension provides NOBRAND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nobrand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nobrand: Any
  get() = object {
      /** NOBRAND stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
