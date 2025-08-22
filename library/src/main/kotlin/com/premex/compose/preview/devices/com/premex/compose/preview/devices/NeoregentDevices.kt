package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Neoregent device specifications for Android Compose previews.
 *
 * This extension provides Neoregent device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Neoregent.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Neoregent: Any
  get() = object {
      /** DeviceSpec(manufacturer=Neoregent, code=KT1007_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Neoregent, code=KT1007_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val KT1007_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
