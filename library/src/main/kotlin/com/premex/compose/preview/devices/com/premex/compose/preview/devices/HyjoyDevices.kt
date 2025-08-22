package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hyjoy device specifications for Android Compose previews.
 *
 * This extension provides Hyjoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hyjoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hyjoy: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hyjoy, code=P11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyjoy, code=P11, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hyjoy, code=P11_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hyjoy, code=P11_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
