package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TGnCo device specifications for Android Compose previews.
 *
 * This extension provides TGnCo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TGnCo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TGnCo: Any
  get() = object {
      /** DeviceSpec(manufacturer=TGnCo, code=JGR, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TGnCo, code=JGR, width=1440,
      height=2560, dpi=560, isGoogleDevice=false).code */
      val JGR = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=TGnCo, code=PHX, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TGnCo, code=PHX, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PHX = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
