package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Trekstor device specifications for Android Compose previews.
 *
 * This extension provides Trekstor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trekstor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trekstor: Any
  get() = object {
      /** DeviceSpec(manufacturer=Trekstor, code=TFMTKAW01216, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trekstor, code=TFMTKAW01216,
      width=1080, height=1920, dpi=213, isGoogleDevice=false).code */
      val TFMTKAW01216 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Trekstor, code=TFMTKAW01232, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trekstor, code=TFMTKAW01232,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val TFMTKAW01232 = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Trekstor, code=TFMTKAW01332, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trekstor, code=TFMTKAW01332,
      width=1080, height=1920, dpi=213, isGoogleDevice=false).code */
      val TFMTKAW01332 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Trekstor, code=THMTKAW01232, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trekstor, code=THMTKAW01232,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val THMTKAW01232 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
