package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Billow device specifications for Android Compose previews.
 *
 * This extension provides Billow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Billow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Billow: Any
  get() = object {
      /** DeviceSpec(manufacturer=Billow, code=X101PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Billow, code=X101PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X101PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Billow, code=X103PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Billow, code=X103PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X103PRO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
