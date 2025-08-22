package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ayat device specifications for Android Compose previews.
 *
 * This extension provides Ayat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ayat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ayat: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ayat, code=Ayat101, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ayat, code=Ayat101, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val AYAT101 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Ayat, code=Ayat_101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ayat, code=Ayat_101, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AYAT_101 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
