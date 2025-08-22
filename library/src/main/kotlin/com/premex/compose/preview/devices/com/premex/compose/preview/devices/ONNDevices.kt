package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ONN device specifications for Android Compose previews.
 *
 * This extension provides ONN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ONN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ONN: Any
  get() = object {
      /** DeviceSpec(manufacturer=ONN, code=mid7015_mk_32, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONN, code=mid7015_mk_32, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7015_MK_32 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ONN, code=mid8016_mk_32, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONN, code=mid8016_mk_32, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MID8016_MK_32 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ONN, code=W723, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONN, code=W723, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val W723 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ONN, code=100015685-A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONN, code=100015685-A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _100015685_A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ONN, code=100015685-E, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ONN, code=100015685-E, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _100015685_E = "spec:width=600,height=1024,unit=px,dpi=160"

  }
