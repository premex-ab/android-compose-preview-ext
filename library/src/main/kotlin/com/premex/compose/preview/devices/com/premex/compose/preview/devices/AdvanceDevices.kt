package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Advance device specifications for Android Compose previews.
 *
 * This extension provides Advance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Advance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Advance: Any
  get() = object {
      /** DeviceSpec(manufacturer=Advance, code=Pr5650, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Advance, code=Pr5650, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PR5650 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Advance, code=Pr7547, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Advance, code=Pr7547, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PR7547 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Advance, code=Tr4986, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Advance, code=Tr4986, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TR4986 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
