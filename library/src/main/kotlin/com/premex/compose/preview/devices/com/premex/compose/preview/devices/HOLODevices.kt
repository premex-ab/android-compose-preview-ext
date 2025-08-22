package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOLO device specifications for Android Compose previews.
 *
 * This extension provides HOLO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOLO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOLO: Any
  get() = object {
      /** DeviceSpec(manufacturer=HOLO, code=VE0319, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOLO, code=VE0319, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VE0319 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOLO, code=VE1983, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOLO, code=VE1983, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VE1983 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOLO, code=X10, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOLO, code=X10, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val X10 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HOLO, code=XULTRA2, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOLO, code=XULTRA2, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val XULTRA2 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HOLO, code=XULTRA3, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOLO, code=XULTRA3, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val XULTRA3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOLO, code=XULTRAPLUS, width=1200, height=2000, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOLO, code=XULTRAPLUS, width=1200,
      height=2000, dpi=213, isGoogleDevice=false).code */
      val XULTRAPLUS = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOLO, code=XULTRAPLUS3, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOLO, code=XULTRAPLUS3, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val XULTRAPLUS3 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
