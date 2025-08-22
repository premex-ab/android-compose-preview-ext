package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXON device specifications for Android Compose previews.
 *
 * This extension provides MAXON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAXON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAXON: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAXON, code=Acer_AC50, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXON, code=Acer_AC50, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ACER_AC50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MAXON, code=Senwa_S40, width=480, height=800, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXON, code=Senwa_S40, width=480,
      height=800, dpi=220, isGoogleDevice=false).code */
      val SENWA_S40 = "spec:width=480,height=800,unit=px,dpi=220"

  }
