package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * nvidia device specifications for Android Compose previews.
 *
 * This extension provides nvidia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nvidia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nvidia: Any
  get() = object {
      /** DeviceSpec(manufacturer=nvidia, code=roth, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nvidia, code=roth, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ROTH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nvidia, code=shieldtablet, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nvidia, code=shieldtablet,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val SHIELDTABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=nvidia, code=tegranote, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nvidia, code=tegranote, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TEGRANOTE = "spec:width=800,height=1280,unit=px,dpi=213"

  }
