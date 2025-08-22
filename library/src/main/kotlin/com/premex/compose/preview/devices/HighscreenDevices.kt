package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Highscreen device specifications for Android Compose previews.
 *
 * This extension provides Highscreen device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Highscreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Highscreen: Any
  get() = object {
      /** Highscreen Max3 */
      val MAX3 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Highscreen PowerFiveMax2 */
      val POWERFIVEMAX2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Highscreen PowerIceEvo */
      val POWERICEEVO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
