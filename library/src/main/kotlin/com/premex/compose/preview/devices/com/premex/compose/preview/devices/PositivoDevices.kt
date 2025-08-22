package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Positivo device specifications for Android Compose previews.
 *
 * This extension provides Positivo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Positivo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Positivo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Positivo, code=G1036, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=G1036, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G1036 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Positivo, code=KC771, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=KC771, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KC771 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Positivo, code=M16QF1XMT8183, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=M16QF1XMT8183,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M16QF1XMT8183 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Positivo, code=Q20, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=Q20, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Q20 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Positivo, code=S455, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=S455, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S455 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Positivo, code=S620, width=480, height=1014, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=S620, width=480,
      height=1014, dpi=280, isGoogleDevice=false).code */
      val S620 = "spec:width=480,height=1014,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Positivo, code=S640, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=S640, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val S640 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Positivo, code=S650, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=S650, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S650 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Positivo, code=T1085, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=T1085, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T1085 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Positivo, code=T2050M, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=T2050M, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T2050M = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Positivo, code=T3010D, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=T3010D, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T3010D = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Positivo, code=T307F, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=T307F, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T307F = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Positivo, code=TL10, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Positivo, code=TL10, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val TL10 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
