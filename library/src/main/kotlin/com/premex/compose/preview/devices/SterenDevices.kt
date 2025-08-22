package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Steren device specifications for Android Compose previews.
 *
 * This extension provides Steren device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Steren.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Steren: Any
  get() = object {
      /** Steren INTV */
      val INTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Steren INTV_1000 */
      val INTV_1000 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Steren INTV_ASIST */
      val INTV_ASIST = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
