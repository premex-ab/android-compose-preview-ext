package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NAVON device specifications for Android Compose previews.
 *
 * This extension provides NAVON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NAVON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NAVON: Any
  get() = object {
      /** NAVON D455 */
      val D455 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
