package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fly device specifications for Android Compose previews.
 *
 * This extension provides Fly device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fly.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fly: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fly, code=Cirrus_13, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Cirrus_13, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CIRRUS_13 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Fly, code=Cirrus_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Cirrus_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CIRRUS_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Fly, code=Cirrus_3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Cirrus_3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CIRRUS_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Fly, code=Cirrus_4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Cirrus_4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CIRRUS_4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Fly, code=Compact_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Compact_4G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val COMPACT_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fly, code=Flylife_Connect_101_3G_2, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly,
      code=Flylife_Connect_101_3G_2, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FLYLIFE_CONNECT_101_3G_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fly, code=IQ4514_Quad, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=IQ4514_Quad, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IQ4514_QUAD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Fly, code=IQ456, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=IQ456, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IQ456 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fly, code=Nimbus_16, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Nimbus_16, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NIMBUS_16 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fly, code=Nimbus_8, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Nimbus_8, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NIMBUS_8 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fly, code=Nimbus_9, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Nimbus_9, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NIMBUS_9 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fly, code=Slimline, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Slimline, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SLIMLINE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Fly, code=Stratus_6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=Stratus_6, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STRATUS_6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fly, code=ViewMax, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fly, code=ViewMax, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val VIEWMAX = "spec:width=540,height=1132,unit=px,dpi=240"

  }
