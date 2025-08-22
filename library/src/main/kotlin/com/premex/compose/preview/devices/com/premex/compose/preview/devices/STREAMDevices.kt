package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STREAM device specifications for Android Compose previews.
 *
 * This extension provides STREAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STREAM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STREAM: Any
  get() = object {
      /** DeviceSpec(manufacturer=STREAM, code=B1s, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=B1s, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val B1S = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STREAM, code=B2Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=B2Plus, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val B2PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STREAM, code=B3Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=B3Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B3PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STREAM, code=capitolhill, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=capitolhill,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=STREAM, code=Everest, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=Everest, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EVEREST = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STREAM, code=HT16, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=HT16, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HT16 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STREAM, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STREAM, code=MIRROR, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=MIRROR, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MIRROR = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STREAM, code=R10G, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=R10G, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STREAM, code=SHARK, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STREAM, code=SHARK, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHARK = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
