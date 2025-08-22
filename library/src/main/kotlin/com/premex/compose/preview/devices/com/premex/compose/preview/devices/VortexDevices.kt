package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vortex device specifications for Android Compose previews.
 *
 * This extension provides Vortex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vortex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vortex: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vortex, code=A24, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=A24, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val A24 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vortex, code=C24L, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=C24L, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val C24L = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Vortex, code=CB68, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=CB68, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val CB68 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vortex, code=CG65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=CG65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CG65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=G8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=G8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vortex, code=HD55, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD55, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val HD55 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Vortex, code=HD60, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD60, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val HD60 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vortex, code=HD60i, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD60i, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val HD60I = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Vortex, code=HD60L, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD60L, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val HD60L = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Vortex, code=HD62, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD62, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val HD62 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=HD65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HD65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=HD65_PLUS, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD65_PLUS, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HD65_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=HD65_Select, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD65_Select,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HD65_SELECT = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=HD65_Ultra, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD65_Ultra, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HD65_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=HD67, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=HD67, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HD67 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=J24, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=J24, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val J24 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=MUV, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=MUV, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MUV = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vortex, code=NS65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=NS65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NS65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=Sync, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=Sync, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SYNC = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vortex, code=T10M_Pro, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=T10M_Pro, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val T10M_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Vortex, code=TAB8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=TAB8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vortex, code=V22, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=V22, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val V22 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=V22S, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=V22S, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val V22S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=Z22, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=Z22, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=Z23, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=Z23, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z23 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=ZG55, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=ZG55, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val ZG55 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Vortex, code=ZG65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=ZG65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ZG65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vortex, code=ZG65_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vortex, code=ZG65_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ZG65_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
