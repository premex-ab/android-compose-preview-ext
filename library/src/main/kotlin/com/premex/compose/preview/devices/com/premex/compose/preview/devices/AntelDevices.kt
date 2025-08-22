package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Antel device specifications for Android Compose previews.
 *
 * This extension provides Antel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Antel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Antel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Antel, code=Antel_B866V2FAS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Antel, code=Antel_B866V2FAS,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ANTEL_B866V2FAS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Antel, code=DV8547, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Antel, code=DV8547, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8547 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
