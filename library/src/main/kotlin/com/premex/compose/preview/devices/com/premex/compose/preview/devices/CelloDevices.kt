package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cello device specifications for Android Compose previews.
 *
 * This extension provides Cello device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cello.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cello: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cello, code=T1045PC, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cello, code=T1045PC, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T1045PC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cello, code=T1045PN, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cello, code=T1045PN, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T1045PN = "spec:width=600,height=1024,unit=px,dpi=160"

  }
