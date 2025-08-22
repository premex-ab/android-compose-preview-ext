package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Olive device specifications for Android Compose previews.
 *
 * This extension provides Olive device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Olive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Olive: Any
  get() = object {
      /** DeviceSpec(manufacturer=Olive, code=bruno, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Olive, code=bruno, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Olive, code=shilin, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Olive, code=shilin, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
