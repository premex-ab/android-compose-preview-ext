package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Movix device specifications for Android Compose previews.
 *
 * This extension provides Movix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Movix, code=MVX01, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Movix, code=MVX01, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MVX01 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Movix, code=MVX02, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Movix, code=MVX02, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MVX02 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Movix, code=MVX03, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Movix, code=MVX03, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MVX03 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Movix, code=SEI700ER, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Movix, code=SEI700ER, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700ER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
