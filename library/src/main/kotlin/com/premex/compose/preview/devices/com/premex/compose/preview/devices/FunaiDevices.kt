package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Funai device specifications for Android Compose previews.
 *
 * This extension provides Funai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Funai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Funai: Any
  get() = object {
      /** DeviceSpec(manufacturer=Funai, code=cocina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Funai, code=cocina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val COCINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Funai, code=freesia, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Funai, code=freesia, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val FREESIA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Funai, code=peach, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Funai, code=peach, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PEACH = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
