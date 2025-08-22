package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Overmax device specifications for Android Compose previews.
 *
 * This extension provides Overmax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Overmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Overmax: Any
  get() = object {
      /** DeviceSpec(manufacturer=Overmax, code=Livecore7032, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Overmax, code=Livecore7032,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LIVECORE7032 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Overmax, code=OV10273G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Overmax, code=OV10273G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val OV10273G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Overmax, code=OV10274G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Overmax, code=OV10274G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OV10274G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Overmax, code=OV-Qualcore-1023-3G, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Overmax,
      code=OV-Qualcore-1023-3G, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val OV_QUALCORE_1023_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Overmax, code=OV-Qualcore-7023-3G, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Overmax,
      code=OV-Qualcore-7023-3G, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val OV_QUALCORE_7023_3G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
