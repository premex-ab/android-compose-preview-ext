package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Spectralink device specifications for Android Compose previews.
 *
 * This extension provides Spectralink device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spectralink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spectralink: Any
  get() = object {
      /** DeviceSpec(manufacturer=Spectralink, code=VC92, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Spectralink, code=VC92, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VC92 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Spectralink, code=Versity, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Spectralink, code=Versity,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val VERSITY = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
