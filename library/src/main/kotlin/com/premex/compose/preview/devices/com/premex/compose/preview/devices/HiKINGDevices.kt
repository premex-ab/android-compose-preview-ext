package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HiKING device specifications for Android Compose previews.
 *
 * This extension provides HiKING device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HiKING.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HiKING: Any
  get() = object {
      /** DeviceSpec(manufacturer=HiKING, code=A23, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiKING, code=A23, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A23 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HiKING, code=A44, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiKING, code=A44, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val A44 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HiKING, code=A46, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiKING, code=A46, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val A46 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HiKING, code=A51, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiKING, code=A51, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val A51 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HiKING, code=KIDS_1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiKING, code=KIDS_1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDS_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HiKING, code=Rugged_S1, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiKING, code=Rugged_S1, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RUGGED_S1 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HiKING, code=Rugged_S2, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiKING, code=Rugged_S2, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RUGGED_S2 = "spec:width=576,height=1280,unit=px,dpi=240"

  }
