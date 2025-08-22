package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * S device specifications for Android Compose previews.
 *
 * This extension provides S device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.S.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.S: Any
  get() = object {
      /** DeviceSpec(manufacturer=S, code=T8100, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=S, code=T8100, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8100 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=S, code=T8116, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=S, code=T8116, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8116 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=S, code=T8133_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=S, code=T8133_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8133_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
