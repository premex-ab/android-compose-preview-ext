package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Accent device specifications for Android Compose previews.
 *
 * This extension provides Accent device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Accent.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Accent: Any
  get() = object {
      /** DeviceSpec(manufacturer=Accent, code=Fast17, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Accent, code=Fast17, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val FAST17 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Accent, code=FAST7, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Accent, code=FAST7, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val FAST7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Accent, code=KIDZY70, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Accent, code=KIDZY70, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDZY70 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Accent, code=Speed-X2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Accent, code=Speed-X2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SPEED_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Accent, code=Speed-Y3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Accent, code=Speed-Y3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SPEED_Y3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
