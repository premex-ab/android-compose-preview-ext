package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * N-one device specifications for Android Compose previews.
 *
 * This extension provides N-one device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.None.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.None: Any
  get() = object {
      /** DeviceSpec(manufacturer=N-one, code=NpadAir, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=N-one, code=NpadAir, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val NPADAIR = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=N-one, code=Npadplus, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=N-one, code=Npadplus, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val NPADPLUS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=N-one, code=NpadQ, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=N-one, code=NpadQ, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NPADQ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=N-one, code=NpadS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=N-one, code=NpadS, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NPADS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=N-one, code=NpadY, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=N-one, code=NpadY, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NPADY = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=N-one, code=NpadY1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=N-one, code=NpadY1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NPADY1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=N-one, code=Npad_ultra, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=N-one, code=Npad_ultra, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val NPAD_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=N-one, code=TAB005, width=1200, height=2000, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=N-one, code=TAB005, width=1200,
      height=2000, dpi=213, isGoogleDevice=false).code */
      val TAB005 = "spec:width=1200,height=2000,unit=px,dpi=213"

  }
