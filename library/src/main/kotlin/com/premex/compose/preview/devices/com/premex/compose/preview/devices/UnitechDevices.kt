package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Unitech device specifications for Android Compose previews.
 *
 * This extension provides Unitech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unitech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unitech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Unitech, code=EA510, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unitech, code=EA510, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EA510 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Unitech, code=TB85, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unitech, code=TB85, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TB85 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Unitech, code=wd200, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unitech, code=wd200, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val WD200 = "spec:width=480,height=800,unit=px,dpi=240"

  }
