package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vucatimes device specifications for Android Compose previews.
 *
 * This extension provides Vucatimes device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vucatimes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vucatimes: Any
  get() = object {
      /** Vucatimes VucaPad_N20 */
      val VUCAPAD_N20 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Vucatimes VucaPad_NS20_EEA */
      val VUCAPAD_NS20_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
