package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gangnam device specifications for Android Compose previews.
 *
 * This extension provides Gangnam device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gangnam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gangnam: Any
  get() = object {
      /** DeviceSpec(manufacturer=Gangnam, code=anglelake, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gangnam, code=anglelake, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ANGLELAKE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Gangnam, code=waiawa, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gangnam, code=waiawa, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WAIAWA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
