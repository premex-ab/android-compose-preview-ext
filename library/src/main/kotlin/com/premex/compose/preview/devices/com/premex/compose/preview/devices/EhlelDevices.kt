package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ehlel device specifications for Android Compose previews.
 *
 * This extension provides Ehlel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ehlel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ehlel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ehlel, code=Ehlel-C7PRO, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ehlel, code=Ehlel-C7PRO, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val EHLEL_C7PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Ehlel, code=Ehlel_Defender_D23, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ehlel, code=Ehlel_Defender_D23,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val EHLEL_DEFENDER_D23 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Ehlel, code=Ehlel-Hulan21, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ehlel, code=Ehlel-Hulan21,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val EHLEL_HULAN21 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
