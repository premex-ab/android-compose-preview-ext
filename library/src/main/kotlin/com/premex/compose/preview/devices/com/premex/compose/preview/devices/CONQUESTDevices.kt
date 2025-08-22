package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONQUEST device specifications for Android Compose previews.
 *
 * This extension provides CONQUEST device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONQUEST.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONQUEST: Any
  get() = object {
      /** DeviceSpec(manufacturer=CONQUEST, code=conquest_S16, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONQUEST, code=conquest_S16,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val CONQUEST_S16 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CONQUEST, code=conquest_S20, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONQUEST, code=conquest_S20,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val CONQUEST_S20 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CONQUEST, code=conquest-S20, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONQUEST, code=conquest-S20,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val CONQUEST_S20 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CONQUEST, code=CONQUEST-S23, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONQUEST, code=CONQUEST-S23,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val CONQUEST_S23 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CONQUEST, code=F5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONQUEST, code=F5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val F5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CONQUEST, code=S12Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONQUEST, code=S12Pro, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S12PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CONQUEST, code=S21, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONQUEST, code=S21, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S21 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
