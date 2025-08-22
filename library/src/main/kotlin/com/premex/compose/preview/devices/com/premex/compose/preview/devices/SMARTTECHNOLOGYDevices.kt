package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMART-TECHNOLOGY device specifications for Android Compose previews.
 *
 * This extension provides SMART-TECHNOLOGY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTTECHNOLOGY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTTECHNOLOGY: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMART-TECHNOLOGY, code=elliniko, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART-TECHNOLOGY, code=elliniko,
      width=2160, height=3840, dpi=320, isGoogleDevice=false).code */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SMART-TECHNOLOGY, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART-TECHNOLOGY, code=stanford,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SMART-TECHNOLOGY, code=zhongshan, width=1080, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART-TECHNOLOGY,
      code=zhongshan, width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
