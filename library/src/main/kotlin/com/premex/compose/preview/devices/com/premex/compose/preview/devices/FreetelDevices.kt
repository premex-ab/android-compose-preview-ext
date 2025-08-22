package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * freetel device specifications for Android Compose previews.
 *
 * This extension provides freetel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Freetel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Freetel: Any
  get() = object {
      /** DeviceSpec(manufacturer=freetel, code=FTJ152A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=freetel, code=FTJ152A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val FTJ152A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=freetel, code=FTJ152B, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=freetel, code=FTJ152B, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FTJ152B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=freetel, code=FTJ152C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=freetel, code=FTJ152C, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FTJ152C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=freetel, code=ICE2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=freetel, code=ICE2, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ICE2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=freetel, code=Priori4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=freetel, code=Priori4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIORI4 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
