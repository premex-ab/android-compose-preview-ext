package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Jeazans device specifications for Android Compose previews.
 *
 * This extension provides Jeazans device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jeazans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jeazans: Any
  get() = object {
      /** DeviceSpec(manufacturer=Jeazans, code=A13, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jeazans, code=A13, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Jeazans, code=KT1016, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jeazans, code=KT1016, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KT1016 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
