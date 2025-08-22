package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Stylo device specifications for Android Compose previews.
 *
 * This extension provides Stylo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stylo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stylo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Stylo, code=Quantum, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Stylo, code=Quantum, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val QUANTUM = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Stylo, code=S501, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Stylo, code=S501, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S501 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Stylo, code=Sirius_Plus_Tab_10, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Stylo, code=Sirius_Plus_Tab_10,
      width=800, height=1280, dpi=220, isGoogleDevice=false).code */
      val SIRIUS_PLUS_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Stylo, code=Stylo_521, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Stylo, code=Stylo_521, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val STYLO_521 = "spec:width=720,height=1600,unit=px,dpi=300"

  }
