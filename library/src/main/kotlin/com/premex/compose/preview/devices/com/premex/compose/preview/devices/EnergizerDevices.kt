package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Energizer device specifications for Android Compose previews.
 *
 * This extension provides Energizer device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Energizer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Energizer: Any
  get() = object {
      /** DeviceSpec(manufacturer=Energizer, code=H620SEU, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Energizer, code=H620SEU, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val H620SEU = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Energizer, code=HARDCASEH550S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Energizer, code=HARDCASEH550S,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val HARDCASEH550S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Energizer, code=PowerMaxP550S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Energizer, code=PowerMaxP550S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POWERMAXP550S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Energizer, code=S550, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Energizer, code=S550, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S550 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Energizer, code=U505S, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Energizer, code=U505S, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val U505S = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Energizer, code=U506S, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Energizer, code=U506S, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val U506S = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Energizer, code=U608S, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Energizer, code=U608S, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val U608S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Energizer, code=U652S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Energizer, code=U652S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val U652S = "spec:width=720,height=1600,unit=px,dpi=320"

  }
