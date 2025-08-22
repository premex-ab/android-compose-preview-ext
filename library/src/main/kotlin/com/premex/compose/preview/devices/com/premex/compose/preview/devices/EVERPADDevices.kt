package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVERPAD device specifications for Android Compose previews.
 *
 * This extension provides EVERPAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVERPAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVERPAD: Any
  get() = object {
      /** DeviceSpec(manufacturer=EVERPAD, code=EVERPAD-EW2021, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERPAD, code=EVERPAD-EW2021,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val EVERPAD_EW2021 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EVERPAD, code=EW2010, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERPAD, code=EW2010, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EW2010 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EVERPAD, code=EW2020, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERPAD, code=EW2020, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EW2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EVERPAD, code=EW2022, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVERPAD, code=EW2022, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EW2022 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
