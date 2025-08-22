package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Droidlogic device specifications for Android Compose previews.
 *
 * This extension provides Droidlogic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Droidlogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Droidlogic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Droidlogic, code=ampere, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Droidlogic, code=ampere, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AMPERE = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Droidlogic, code=franklin, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Droidlogic, code=franklin,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val FRANKLIN = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Droidlogic, code=oppen, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Droidlogic, code=oppen, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val OPPEN = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
