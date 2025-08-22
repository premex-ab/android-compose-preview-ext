package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AOYODKG device specifications for Android Compose previews.
 *
 * This extension provides AOYODKG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AOYODKG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AOYODKG: Any
  get() = object {
      /** DeviceSpec(manufacturer=AOYODKG, code=M50, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOYODKG, code=M50, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AOYODKG, code=M50_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOYODKG, code=M50_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
