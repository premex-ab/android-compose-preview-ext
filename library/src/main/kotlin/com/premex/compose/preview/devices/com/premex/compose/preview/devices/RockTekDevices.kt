package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RockTek device specifications for Android Compose previews.
 *
 * This extension provides RockTek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RockTek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RockTek: Any
  get() = object {
      /** DeviceSpec(manufacturer=RockTek, code=RTBox, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RockTek, code=RTBox, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RTBOX = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
