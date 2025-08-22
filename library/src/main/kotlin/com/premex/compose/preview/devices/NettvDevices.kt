package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NETTV device specifications for Android Compose previews.
 *
 * This extension provides NETTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nettv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nettv: Any
  get() = object {
      /** NETTV SEI500NTV */
      val SEI500NTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
