package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gevo device specifications for Android Compose previews.
 *
 * This extension provides Gevo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gevo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gevo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Gevo, code=Gevo_V10, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gevo, code=Gevo_V10, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val GEVO_V10 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Gevo, code=V20, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gevo, code=V20, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val V20 = "spec:width=720,height=1640,unit=px,dpi=320"

  }
