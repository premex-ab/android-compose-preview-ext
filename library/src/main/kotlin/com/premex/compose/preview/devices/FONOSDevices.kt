package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FONOS device specifications for Android Compose previews.
 *
 * This extension provides FONOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FONOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FONOS: Any
  get() = object {
      /** FONOS M1 */
      val M1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** FONOS O2 */
      val O2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
