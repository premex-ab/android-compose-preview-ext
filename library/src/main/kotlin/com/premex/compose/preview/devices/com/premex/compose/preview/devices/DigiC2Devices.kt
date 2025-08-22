package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Digi_C2 device specifications for Android Compose previews.
 *
 * This extension provides Digi_C2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DigiC2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DigiC2: Any
  get() = object {
      /** DeviceSpec(manufacturer=Digi_C2, code=Digi_C2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digi_C2, code=Digi_C2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val DIGI_C2 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
