package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LANDI device specifications for Android Compose previews.
 *
 * This extension provides LANDI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LANDI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LANDI: Any
  get() = object {
      /** DeviceSpec(manufacturer=LANDI, code=AN-LFC, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANDI, code=AN-LFC, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val AN_LFC = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LANDI, code=M20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANDI, code=M20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val M20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LANDI, code=M20SE, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANDI, code=M20SE, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val M20SE = "spec:width=720,height=1600,unit=px,dpi=320"

  }
