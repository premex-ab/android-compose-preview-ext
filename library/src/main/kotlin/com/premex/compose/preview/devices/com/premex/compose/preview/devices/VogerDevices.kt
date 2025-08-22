package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Voger device specifications for Android Compose previews.
 *
 * This extension provides Voger device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Voger.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Voger: Any
  get() = object {
      /** DeviceSpec(manufacturer=Voger, code=X100, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Voger, code=X100, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X100 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Voger, code=X100_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Voger, code=X100_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X100_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
