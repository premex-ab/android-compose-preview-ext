package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ditec device specifications for Android Compose previews.
 *
 * This extension provides Ditec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ditec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ditec: Any
  get() = object {
      /** Ditec Blade */
      val BLADE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Ditec XP */
      val XP = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
