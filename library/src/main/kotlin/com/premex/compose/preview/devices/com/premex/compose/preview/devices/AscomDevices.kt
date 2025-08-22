package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ascom device specifications for Android Compose previews.
 *
 * This extension provides Ascom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ascom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ascom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ascom, code=ABAA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ascom, code=ABAA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ABAA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Ascom, code=ABBA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ascom, code=ABBA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ABBA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Ascom, code=ACBA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ascom, code=ACBA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ACBA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Ascom, code=ADAA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ascom, code=ADAA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ADAA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Ascom, code=SH4-1, width=1080, height=2160, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ascom, code=SH4-1, width=1080,
      height=2160, dpi=440, isGoogleDevice=false).code */
      val SH4_1 = "spec:width=1080,height=2160,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Ascom, code=SH4-2, width=1080, height=2160, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ascom, code=SH4-2, width=1080,
      height=2160, dpi=440, isGoogleDevice=false).code */
      val SH4_2 = "spec:width=1080,height=2160,unit=px,dpi=440"

  }
