package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Jenesis device specifications for Android Compose previews.
 *
 * This extension provides Jenesis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jenesis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jenesis: Any
  get() = object {
      /** DeviceSpec(manufacturer=Jenesis, code=JT07-81B, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jenesis, code=JT07-81B, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val JT07_81B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Jenesis, code=JT10-81B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jenesis, code=JT10-81B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JT10_81B = "spec:width=800,height=1280,unit=px,dpi=160"

  }
