package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Viper device specifications for Android Compose previews.
 *
 * This extension provides Viper device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Viper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Viper: Any
  get() = object {
      /** DeviceSpec(manufacturer=Viper, code=SZ11MK1, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Viper, code=SZ11MK1, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val SZ11MK1 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Viper, code=Z11MK, width=1200, height=1920, dpi=248,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Viper, code=Z11MK, width=1200,
      height=1920, dpi=248, isGoogleDevice=false).code */
      val Z11MK = "spec:width=1200,height=1920,unit=px,dpi=248"

  }
