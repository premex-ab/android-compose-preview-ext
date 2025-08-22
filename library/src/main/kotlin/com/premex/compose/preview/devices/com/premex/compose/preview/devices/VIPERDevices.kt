package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIPER device specifications for Android Compose previews.
 *
 * This extension provides VIPER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIPER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIPER: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIPER, code=VIPER-Z08MK, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIPER, code=VIPER-Z08MK, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VIPER_Z08MK = "spec:width=800,height=1280,unit=px,dpi=213"

  }
