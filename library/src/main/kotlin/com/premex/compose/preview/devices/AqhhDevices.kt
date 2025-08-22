package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AQHH device specifications for Android Compose previews.
 *
 * This extension provides AQHH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aqhh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aqhh: Any
  get() = object {
      /** AQHH A75 */
      val A75 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
