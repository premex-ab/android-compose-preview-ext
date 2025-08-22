package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Okin device specifications for Android Compose previews.
 *
 * This extension provides Okin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Okin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Okin: Any
  get() = object {
      /** DeviceSpec(manufacturer=Okin, code=FP2901, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Okin, code=FP2901, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val FP2901 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Okin, code=FP290101, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Okin, code=FP290101, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val FP290101 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
