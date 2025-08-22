package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EKINOX device specifications for Android Compose previews.
 *
 * This extension provides EKINOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EKINOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EKINOX: Any
  get() = object {
      /** DeviceSpec(manufacturer=EKINOX, code=E6, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EKINOX, code=E6, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val E6 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EKINOX, code=E8_Ultra, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EKINOX, code=E8_Ultra, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val E8_ULTRA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EKINOX, code=K5, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EKINOX, code=K5, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val K5 = "spec:width=540,height=1132,unit=px,dpi=240"

  }
