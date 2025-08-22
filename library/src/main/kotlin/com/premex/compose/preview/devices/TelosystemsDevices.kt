package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELOSYSTEMS device specifications for Android Compose previews.
 *
 * This extension provides TELOSYSTEMS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telosystems.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telosystems: Any
  get() = object {
      /** TELOSYSTEMS TE590P_E */
      val TE590P_E = "spec:width=480,height=800,unit=px,dpi=240"

      /** TELOSYSTEMS TE590P_O */
      val TE590P_O = "spec:width=480,height=800,unit=px,dpi=240"

  }
