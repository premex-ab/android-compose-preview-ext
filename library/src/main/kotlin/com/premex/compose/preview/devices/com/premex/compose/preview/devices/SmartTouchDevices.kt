package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smart_Touch device specifications for Android Compose previews.
 *
 * This extension provides Smart_Touch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SmartTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SmartTouch: Any
  get() = object {
      /** DeviceSpec(manufacturer=Smart_Touch, code=STG_IR13, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smart_Touch, code=STG_IR13,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val STG_IR13 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
