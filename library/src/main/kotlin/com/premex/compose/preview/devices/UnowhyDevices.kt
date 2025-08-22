package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNOWHY device specifications for Android Compose previews.
 *
 * This extension provides UNOWHY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unowhy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unowhy: Any
  get() = object {
      /** UNOWHY S10G001S4M_EEA */
      val S10G001S4M_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UNOWHY Y10G001S4M */
      val Y10G001S4M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UNOWHY Y10G007S4MI_EEA */
      val Y10G007S4MI_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UNOWHY Y10G007S4M_EEA */
      val Y10G007S4M_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UNOWHY Y10_Premium */
      val Y10_PREMIUM = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
