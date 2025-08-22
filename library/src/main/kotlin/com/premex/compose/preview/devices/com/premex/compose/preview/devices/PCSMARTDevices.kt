package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PCSMART device specifications for Android Compose previews.
 *
 * This extension provides PCSMART device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PCSMART.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PCSMART: Any
  get() = object {
      /** DeviceSpec(manufacturer=PCSMART, code=PCSGOB10MVA-A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCSMART, code=PCSGOB10MVA-A,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PCSGOB10MVA_A = "spec:width=800,height=1280,unit=px,dpi=160"

  }
