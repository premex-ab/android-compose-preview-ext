package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PIXPRO device specifications for Android Compose previews.
 *
 * This extension provides PIXPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PIXPRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PIXPRO: Any
  get() = object {
      /** DeviceSpec(manufacturer=PIXPRO, code=PIXPRO_L1_PRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIXPRO, code=PIXPRO_L1_PRO,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PIXPRO_L1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
