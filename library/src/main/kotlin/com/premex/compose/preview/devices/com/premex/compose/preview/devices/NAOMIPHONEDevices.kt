package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NAOMIPHONE device specifications for Android Compose previews.
 *
 * This extension provides NAOMIPHONE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NAOMIPHONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NAOMIPHONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=NAOMIPHONE, code=NAOMIPHONE_Ambar, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAOMIPHONE, code=NAOMIPHONE_Ambar,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val NAOMIPHONE_AMBAR = "spec:width=480,height=960,unit=px,dpi=240"

  }
