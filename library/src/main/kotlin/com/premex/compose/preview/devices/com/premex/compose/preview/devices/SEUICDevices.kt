package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEUIC device specifications for Android Compose previews.
 *
 * This extension provides SEUIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SEUIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SEUIC: Any
  get() = object {
      /** DeviceSpec(manufacturer=SEUIC, code=d310m, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=d310m, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D310M = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEUIC, code=D360, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=D360, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D360 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEUIC, code=d500b, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=d500b, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D500B = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEUIC, code=d520, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=d520, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val D520 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEUIC, code=D527, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=D527, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val D527 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEUIC, code=d550, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=d550, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D550 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEUIC, code=d560, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=d560, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D560 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SEUIC, code=d700s, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=d700s, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D700S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SEUIC, code=d730, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=d730, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val D730 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SEUIC, code=d740, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SEUIC, code=d740, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val D740 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
