package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POWMUS device specifications for Android Compose previews.
 *
 * This extension provides POWMUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POWMUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POWMUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=POWMUS, code=L211-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POWMUS, code=L211-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L211_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=POWMUS, code=L30, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POWMUS, code=L30, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val L30 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=POWMUS, code=L60, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POWMUS, code=L60, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val L60 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
