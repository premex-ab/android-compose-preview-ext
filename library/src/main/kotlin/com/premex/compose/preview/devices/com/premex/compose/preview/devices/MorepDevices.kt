package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Morep device specifications for Android Compose previews.
 *
 * This extension provides Morep device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Morep.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Morep: Any
  get() = object {
      /** DeviceSpec(manufacturer=Morep, code=Mavic_10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Morep, code=Mavic_10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MAVIC_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Morep, code=Mavic_30, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Morep, code=Mavic_30, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MAVIC_30 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Morep, code=Mavic_Plus, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Morep, code=Mavic_Plus, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val MAVIC_PLUS = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Morep, code=Smart_V1, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Morep, code=Smart_V1, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val SMART_V1 = "spec:width=480,height=854,unit=px,dpi=200"

  }
