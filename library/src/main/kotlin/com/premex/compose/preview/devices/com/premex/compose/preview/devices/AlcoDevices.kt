package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Alco device specifications for Android Compose previews.
 *
 * This extension provides Alco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alco: Any
  get() = object {
      /** DeviceSpec(manufacturer=Alco, code=Alco_S9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alco, code=Alco_S9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ALCO_S9 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
