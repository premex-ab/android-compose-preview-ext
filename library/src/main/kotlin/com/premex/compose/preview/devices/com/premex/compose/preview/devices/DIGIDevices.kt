package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIGI device specifications for Android Compose previews.
 *
 * This extension provides DIGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIGI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIGI: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIGI, code=Digi_C1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGI, code=Digi_C1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DIGI_C1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGI, code=Digi_K1, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGI, code=Digi_K1, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val DIGI_K1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DIGI, code=Digi_K2, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGI, code=Digi_K2, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val DIGI_K2 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DIGI, code=Digi_R1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGI, code=Digi_R1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DIGI_R1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGI, code=DIGI_R2A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGI, code=DIGI_R2A, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DIGI_R2A = "spec:width=720,height=1280,unit=px,dpi=320"

  }
