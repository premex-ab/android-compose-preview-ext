package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-mee device specifications for Android Compose previews.
 *
 * This extension provides G-mee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gmee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gmee: Any
  get() = object {
      /** DeviceSpec(manufacturer=G-mee, code=ConnectPro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-mee, code=ConnectPro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CONNECTPRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=G-mee, code=ConnectPro_L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-mee, code=ConnectPro_L,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val CONNECTPRO_L = "spec:width=720,height=1440,unit=px,dpi=320"

  }
