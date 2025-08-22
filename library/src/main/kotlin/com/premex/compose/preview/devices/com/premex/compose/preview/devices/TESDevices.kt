package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TES device specifications for Android Compose previews.
 *
 * This extension provides TES device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TES.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TES: Any
  get() = object {
      /** DeviceSpec(manufacturer=TES, code=igs-series, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TES, code=igs-series, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val IGS_SERIES = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TES, code=igs-series-gen2, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TES, code=igs-series-gen2,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val IGS_SERIES_GEN2 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
