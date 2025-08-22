package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nubio_Lite device specifications for Android Compose previews.
 *
 * This extension provides Nubio_Lite device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NubioLite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NubioLite: Any
  get() = object {
      /** DeviceSpec(manufacturer=Nubio_Lite, code=LS032I, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nubio_Lite, code=LS032I, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LS032I = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Nubio_Lite, code=LS032M, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nubio_Lite, code=LS032M, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LS032M = "spec:width=720,height=1440,unit=px,dpi=320"

  }
