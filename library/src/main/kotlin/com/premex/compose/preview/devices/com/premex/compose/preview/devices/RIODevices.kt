package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RIO device specifications for Android Compose previews.
 *
 * This extension provides RIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RIO: Any
  get() = object {
      /** DeviceSpec(manufacturer=RIO, code=R7MAX, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RIO, code=R7MAX, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val R7MAX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RIO, code=RIOPAD_7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RIO, code=RIOPAD_7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RIOPAD_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=RIO, code=RIOPAD_S10_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RIO, code=RIOPAD_S10_Pro,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val RIOPAD_S10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=RIO, code=RW8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RIO, code=RW8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RW8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
