package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sonim device specifications for Android Compose previews.
 *
 * This extension provides Sonim device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sonim.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sonim: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sonim, code=RS60, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=RS60, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RS60 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sonim, code=RS80, width=1200, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=RS80, width=1200,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RS80 = "spec:width=1200,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sonim, code=X400, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=X400, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val X400 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Sonim, code=X800, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=X800, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val X800 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sonim, code=X801, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=X801, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val X801 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sonim, code=X802, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=X802, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val X802 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sonim, code=XP6700, width=320, height=432, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=XP6700, width=320,
      height=432, dpi=160, isGoogleDevice=false).code */
      val XP6700 = "spec:width=320,height=432,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sonim, code=XP6700Z1, width=320, height=432, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=XP6700Z1, width=320,
      height=432, dpi=160, isGoogleDevice=false).code */
      val XP6700Z1 = "spec:width=320,height=432,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sonim, code=XP7700, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=XP7700, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val XP7700 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sonim, code=XP7700Z1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=XP7700Z1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val XP7700Z1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sonim, code=XP8800, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=XP8800, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val XP8800 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sonim, code=XP9900, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sonim, code=XP9900, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val XP9900 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
