package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Digi_R2 device specifications for Android Compose previews.
 *
 * This extension provides Digi_R2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DigiR2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DigiR2: Any
  get() = object {
      /** DeviceSpec(manufacturer=Digi_R2, code=Digi_R2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digi_R2, code=Digi_R2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val DIGI_R2 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
