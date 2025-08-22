package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Janam device specifications for Android Compose previews.
 *
 * This extension provides Janam device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Janam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Janam: Any
  get() = object {
      /** DeviceSpec(manufacturer=Janam, code=XG200, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Janam, code=XG200, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val XG200 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Janam, code=XG4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Janam, code=XG4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val XG4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Janam, code=XT2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Janam, code=XT2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XT2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Janam, code=XT200, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Janam, code=XT200, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val XT200 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Janam, code=XT3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Janam, code=XT3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XT3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Janam, code=XT30, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Janam, code=XT30, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XT30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Janam, code=XT40, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Janam, code=XT40, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XT40 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
