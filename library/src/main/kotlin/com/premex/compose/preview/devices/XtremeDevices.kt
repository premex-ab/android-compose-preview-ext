package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xtreme device specifications for Android Compose previews.
 *
 * This extension provides Xtreme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xtreme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xtreme: Any
  get() = object {
      /** Xtreme SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Xtreme umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
