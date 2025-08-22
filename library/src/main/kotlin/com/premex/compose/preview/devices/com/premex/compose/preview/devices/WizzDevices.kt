package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * wizz device specifications for Android Compose previews.
 *
 * This extension provides wizz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wizz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wizz: Any
  get() = object {
      /** DeviceSpec(manufacturer=wizz, code=DV-PTB1080, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=wizz, code=DV-PTB1080, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DV_PTB1080 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
