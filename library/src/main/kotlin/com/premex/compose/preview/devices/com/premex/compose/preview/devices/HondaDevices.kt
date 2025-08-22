package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Honda device specifications for Android Compose previews.
 *
 * This extension provides Honda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Honda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Honda: Any
  get() = object {
      /** DeviceSpec(manufacturer=Honda, code=msmnile_au, width=720, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honda, code=msmnile_au, width=720,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val MSMNILE_AU = "spec:width=720,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Honda, code=vcm30t30, width=480, height=800, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honda, code=vcm30t30, width=480,
      height=800, dpi=160, isGoogleDevice=false).code */
      val VCM30T30 = "spec:width=480,height=800,unit=px,dpi=160"

  }
