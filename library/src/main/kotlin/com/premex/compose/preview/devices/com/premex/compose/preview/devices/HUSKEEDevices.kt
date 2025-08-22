package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HUSKEE device specifications for Android Compose previews.
 *
 * This extension provides HUSKEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HUSKEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HUSKEE: Any
  get() = object {
      /** DeviceSpec(manufacturer=HUSKEE, code=HELIOS, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HUSKEE, code=HELIOS, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val HELIOS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HUSKEE, code=HELIOS_Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HUSKEE, code=HELIOS_Plus,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HELIOS_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
