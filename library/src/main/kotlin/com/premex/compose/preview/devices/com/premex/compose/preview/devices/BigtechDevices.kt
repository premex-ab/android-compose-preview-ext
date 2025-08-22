package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bigtech device specifications for Android Compose previews.
 *
 * This extension provides Bigtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bigtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bigtech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bigtech, code=Bigtech_A_RU, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bigtech, code=Bigtech_A_RU,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val BIGTECH_A_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Bigtech, code=Bigtech_B_RU, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bigtech, code=Bigtech_B_RU,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val BIGTECH_B_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
