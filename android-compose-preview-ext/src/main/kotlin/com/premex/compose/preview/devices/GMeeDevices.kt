package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-mee device specifications for Android Compose previews.
 *
 * This extension provides G-mee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GMee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GMee: Any
  get() = object {
      /** G-mee ConnectPro */
      val CONNECTPRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** G-mee ConnectPro_L */
      val CONNECTPRO_L = "spec:width=720,height=1440,unit=px,dpi=320"

  }
