package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JapanTaxi device specifications for Android Compose previews.
 *
 * This extension provides JapanTaxi device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JapanTaxi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JapanTaxi: Any
  get() = object {
      /** DeviceSpec(manufacturer=JapanTaxi, code=IRIS_ITAB05, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JapanTaxi, code=IRIS_ITAB05,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val IRIS_ITAB05 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
