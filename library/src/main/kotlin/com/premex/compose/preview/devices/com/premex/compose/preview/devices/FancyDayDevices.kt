package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FancyDay device specifications for Android Compose previews.
 *
 * This extension provides FancyDay device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FancyDay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FancyDay: Any
  get() = object {
      /** DeviceSpec(manufacturer=FancyDay, code=C10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FancyDay, code=C10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val C10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
