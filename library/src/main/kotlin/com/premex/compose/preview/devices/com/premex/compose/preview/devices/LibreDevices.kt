package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Libre device specifications for Android Compose previews.
 *
 * This extension provides Libre device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Libre.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Libre: Any
  get() = object {
      /** DeviceSpec(manufacturer=Libre, code=W101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Libre, code=W101, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val W101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Libre, code=W808, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Libre, code=W808, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val W808 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
