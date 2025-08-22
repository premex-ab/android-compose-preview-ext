package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Amlogic device specifications for Android Compose previews.
 *
 * This extension provides Amlogic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amlogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amlogic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Amlogic, code=ampere, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amlogic, code=ampere, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AMPERE = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Amlogic, code=p212, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amlogic, code=p212, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P212 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
