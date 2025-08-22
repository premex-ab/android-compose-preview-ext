package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZEEKER device specifications for Android Compose previews.
 *
 * This extension provides ZEEKER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZEEKER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZEEKER: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZEEKER, code=ZEEKER_P10, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZEEKER, code=ZEEKER_P10,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ZEEKER_P10 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZEEKER, code=ZEEKER_T100, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZEEKER, code=ZEEKER_T100,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val ZEEKER_T100 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
