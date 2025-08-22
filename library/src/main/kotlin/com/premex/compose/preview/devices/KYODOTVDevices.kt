package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KYODO-TV device specifications for Android Compose previews.
 *
 * This extension provides KYODO-TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KYODOTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KYODOTV: Any
  get() = object {
      /** KYODO-TV KARAxKARA */
      val KARAXKARA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
