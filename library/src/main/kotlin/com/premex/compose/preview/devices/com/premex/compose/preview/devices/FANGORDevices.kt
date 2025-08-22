package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FANGOR device specifications for Android Compose previews.
 *
 * This extension provides FANGOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FANGOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FANGOR: Any
  get() = object {
      /** DeviceSpec(manufacturer=FANGOR, code=F-863, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FANGOR, code=F-863, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F_863 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FANGOR, code=F-C10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FANGOR, code=F-C10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val F_C10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FANGOR, code=F-X10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FANGOR, code=F-X10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F_X10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
