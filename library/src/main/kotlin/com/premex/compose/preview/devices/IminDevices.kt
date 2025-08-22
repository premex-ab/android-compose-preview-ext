package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Imin device specifications for Android Compose previews.
 *
 * This extension provides Imin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imin: Any
  get() = object {
      /** Imin Swan1Pro */
      val SWAN1PRO = "spec:width=1080,height=1920,unit=px,dpi=220"

      /** Imin Swift2Pro */
      val SWIFT2PRO = "spec:width=720,height=1600,unit=px,dpi=280"

  }
