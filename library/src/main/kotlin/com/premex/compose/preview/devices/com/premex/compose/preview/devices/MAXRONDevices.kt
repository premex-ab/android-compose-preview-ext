package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXRON device specifications for Android Compose previews.
 *
 * This extension provides MAXRON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAXRON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAXRON: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAXRON, code=MXPAD, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXRON, code=MXPAD, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val MXPAD = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MAXRON, code=MXULTRA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXRON, code=MXULTRA, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val MXULTRA = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
