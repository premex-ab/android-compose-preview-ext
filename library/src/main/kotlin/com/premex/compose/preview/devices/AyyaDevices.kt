package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AYYA device specifications for Android Compose previews.
 *
 * This extension provides AYYA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ayya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ayya: Any
  get() = object {
      /** AYYA T1 */
      val T1 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
