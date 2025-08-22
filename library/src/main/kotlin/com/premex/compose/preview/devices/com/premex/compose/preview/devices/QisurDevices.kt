package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Qisur device specifications for Android Compose previews.
 *
 * This extension provides Qisur device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qisur.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qisur: Any
  get() = object {
      /** DeviceSpec(manufacturer=Qisur, code=R106, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qisur, code=R106, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val R106 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Qisur, code=X72, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qisur, code=X72, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X72 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
