package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ditec device specifications for Android Compose previews.
 *
 * This extension provides Ditec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ditec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ditec: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ditec, code=Blade, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ditec, code=Blade, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BLADE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Ditec, code=XP, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ditec, code=XP, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val XP = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
