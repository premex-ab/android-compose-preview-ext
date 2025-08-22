package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PROSCAN device specifications for Android Compose previews.
 *
 * This extension provides PROSCAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PROSCAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PROSCAN: Any
  get() = object {
      /** DeviceSpec(manufacturer=PROSCAN, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROSCAN, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PROSCAN, code=PLT1074G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROSCAN, code=PLT1074G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PLT1074G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PROSCAN, code=PLT7775G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROSCAN, code=PLT7775G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PLT7775G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
