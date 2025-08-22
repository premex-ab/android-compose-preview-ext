package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Athesi device specifications for Android Compose previews.
 *
 * This extension provides Athesi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Athesi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Athesi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Athesi, code=AP5501, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi, code=AP5501, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val AP5501 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Athesi, code=AP5701, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi, code=AP5701, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val AP5701 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Athesi, code=AP5801, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi, code=AP5801, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val AP5801 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Athesi, code=AT-E8T, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi, code=AT-E8T, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AT_E8T = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Athesi, code=E55, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi, code=E55, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Athesi, code=E65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi, code=E65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val E65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Athesi, code=E6A, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi, code=E6A, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val E6A = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Athesi, code=RT4500, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi, code=RT4500, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val RT4500 = "spec:width=480,height=854,unit=px,dpi=240"

  }
