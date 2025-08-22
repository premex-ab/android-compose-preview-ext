package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dcolor device specifications for Android Compose previews.
 *
 * This extension provides Dcolor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dcolor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dcolor: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dcolor, code=YHT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dcolor, code=YHT, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YHT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dcolor, code=YUL, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dcolor, code=YUL, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YUL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
