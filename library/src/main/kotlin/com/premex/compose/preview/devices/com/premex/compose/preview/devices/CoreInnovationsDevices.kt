package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Core_Innovations device specifications for Android Compose previews.
 *
 * This extension provides Core_Innovations device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CoreInnovations.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CoreInnovations: Any
  get() = object {
      /** DeviceSpec(manufacturer=Core_Innovations, code=CRTB7001, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Core_Innovations, code=CRTB7001,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val CRTB7001 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Core_Innovations, code=CTB1016G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Core_Innovations, code=CTB1016G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val CTB1016G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
