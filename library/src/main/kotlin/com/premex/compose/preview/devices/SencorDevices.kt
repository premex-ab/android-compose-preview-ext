package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * sencor device specifications for Android Compose previews.
 *
 * This extension provides sencor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sencor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sencor: Any
  get() = object {
      /** sencor 10_1Q205 */
      val _10_1Q205 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
