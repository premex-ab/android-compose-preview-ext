package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOBICEL device specifications for Android Compose previews.
 *
 * This extension provides MOBICEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MOBICEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MOBICEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=MOBICEL, code=COSMO, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOBICEL, code=COSMO, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val COSMO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MOBICEL, code=ECHO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOBICEL, code=ECHO, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ECHO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MOBICEL, code=FEVER, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOBICEL, code=FEVER, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val FEVER = "spec:width=600,height=1024,unit=px,dpi=213"

  }
