package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * M-HORSE device specifications for Android Compose previews.
 *
 * This extension provides M-HORSE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MHORSE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MHORSE: Any
  get() = object {
      /** DeviceSpec(manufacturer=M-HORSE, code=M2S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M-HORSE, code=M2S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M2S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=M-HORSE, code=Pure_3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M-HORSE, code=Pure_3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PURE_3 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
