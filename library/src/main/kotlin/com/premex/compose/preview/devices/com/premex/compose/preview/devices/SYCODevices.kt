package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SYCO device specifications for Android Compose previews.
 *
 * This extension provides SYCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SYCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SYCO: Any
  get() = object {
      /** DeviceSpec(manufacturer=SYCO, code=GQ3112SH3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYCO, code=GQ3112SH3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GQ3112SH3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SYCO, code=RS-442_EEA, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYCO, code=RS-442_EEA, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RS_442_EEA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SYCO, code=SYCO_RT-401, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYCO, code=SYCO_RT-401, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SYCO_RT_401 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
