package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vodacom device specifications for Android Compose previews.
 *
 * This extension provides Vodacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vodacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vodacom: Any
  get() = object {
      /** Vodacom H6032_VDC */
      val H6032_VDC = "spec:width=576,height=1152,unit=px,dpi=220"

  }
