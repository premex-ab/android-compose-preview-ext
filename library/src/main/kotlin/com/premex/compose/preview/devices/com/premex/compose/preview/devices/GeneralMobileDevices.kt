package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GeneralMobile device specifications for Android Compose previews.
 *
 * This extension provides GeneralMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GeneralMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GeneralMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=GeneralMobile, code=Etab5, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GeneralMobile, code=Etab5,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ETAB5 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GeneralMobile, code=mehmet, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GeneralMobile, code=mehmet,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MEHMET = "spec:width=800,height=1280,unit=px,dpi=160"

  }
