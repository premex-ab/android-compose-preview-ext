package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DayMark device specifications for Android Compose previews.
 *
 * This extension provides DayMark device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DayMark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DayMark: Any
  get() = object {
      /** DeviceSpec(manufacturer=DayMark, code=IT119345, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DayMark, code=IT119345, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val IT119345 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DayMark, code=IT119411, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DayMark, code=IT119411, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val IT119411 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
