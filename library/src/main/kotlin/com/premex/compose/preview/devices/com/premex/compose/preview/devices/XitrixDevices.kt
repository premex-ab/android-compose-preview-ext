package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xitrix device specifications for Android Compose previews.
 *
 * This extension provides Xitrix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xitrix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xitrix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Xitrix, code=TravelPad_A10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xitrix, code=TravelPad_A10,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TRAVELPAD_A10 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
