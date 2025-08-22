package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FiGi device specifications for Android Compose previews.
 *
 * This extension provides FiGi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FiGi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FiGi: Any
  get() = object {
      /** DeviceSpec(manufacturer=FiGi, code=Fj, width=600, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FiGi, code=Fj, width=600,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val FJ = "spec:width=600,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=FiGi, code=FX, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FiGi, code=FX, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val FX = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FiGi, code=G6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FiGi, code=G6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G6 = "spec:width=480,height=960,unit=px,dpi=240"

  }
