package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SITI_Playtop device specifications for Android Compose previews.
 *
 * This extension provides SITI_Playtop device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SITIPlaytop.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SITIPlaytop: Any
  get() = object {
      /** DeviceSpec(manufacturer=SITI_Playtop, code=DTC2141, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SITI_Playtop, code=DTC2141,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DTC2141 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
