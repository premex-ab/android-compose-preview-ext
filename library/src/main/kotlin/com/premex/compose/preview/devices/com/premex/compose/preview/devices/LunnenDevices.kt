package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lunnen device specifications for Android Compose previews.
 *
 * This extension provides Lunnen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lunnen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lunnen: Any
  get() = object {
      /** DeviceSpec(manufacturer=Lunnen, code=TL42810L01, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lunnen, code=TL42810L01,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TL42810L01 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lunnen, code=TL4648S01, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lunnen, code=TL4648S01, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val TL4648S01 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lunnen, code=TL62810G01, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lunnen, code=TL62810G01,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TL62810G01 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lunnen, code=TL65611S01, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lunnen, code=TL65611S01,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TL65611S01 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lunnen, code=TL85611B01, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lunnen, code=TL85611B01,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TL85611B01 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
