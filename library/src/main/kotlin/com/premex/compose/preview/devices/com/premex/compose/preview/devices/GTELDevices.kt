package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GTEL device specifications for Android Compose previews.
 *
 * This extension provides GTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=GTEL, code=Delta_14, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GTEL, code=Delta_14, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val DELTA_14 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GTEL, code=Infinity_13, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GTEL, code=Infinity_13, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val INFINITY_13 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
