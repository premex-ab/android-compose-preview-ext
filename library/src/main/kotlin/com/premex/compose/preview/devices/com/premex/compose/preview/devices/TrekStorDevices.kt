package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TrekStor device specifications for Android Compose previews.
 *
 * This extension provides TrekStor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TrekStor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TrekStor: Any
  get() = object {
      /** DeviceSpec(manufacturer=TrekStor, code=SurfTab, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TrekStor, code=SurfTab, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SURFTAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TrekStor, code=tolino7, width=900, height=1440, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TrekStor, code=tolino7, width=900,
      height=1440, dpi=240, isGoogleDevice=false).code */
      val TOLINO7 = "spec:width=900,height=1440,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TrekStor, code=tolino8, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TrekStor, code=tolino8, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TOLINO8 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TrekStor, code=tolino89, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TrekStor, code=tolino89,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TOLINO89 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
