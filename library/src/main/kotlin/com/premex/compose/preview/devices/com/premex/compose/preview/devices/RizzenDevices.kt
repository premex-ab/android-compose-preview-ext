package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rizzen device specifications for Android Compose previews.
 *
 * This extension provides Rizzen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rizzen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rizzen: Any
  get() = object {
      /** DeviceSpec(manufacturer=Rizzen, code=NovaTab_R10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rizzen, code=NovaTab_R10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val NOVATAB_R10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Rizzen, code=NovaTab_R10s, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rizzen, code=NovaTab_R10s,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val NOVATAB_R10S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Rizzen, code=S1, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rizzen, code=S1, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val S1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Rizzen, code=S1s, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rizzen, code=S1s, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val S1S = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Rizzen, code=X1, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rizzen, code=X1, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val X1 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
