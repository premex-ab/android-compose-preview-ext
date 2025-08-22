package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OANGCC device specifications for Android Compose previews.
 *
 * This extension provides OANGCC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OANGCC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OANGCC: Any
  get() = object {
      /** DeviceSpec(manufacturer=OANGCC, code=A6_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OANGCC, code=A6_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OANGCC, code=A6_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OANGCC, code=A6_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A6_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OANGCC, code=Tab-A8_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OANGCC, code=Tab-A8_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_A8_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
