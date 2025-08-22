package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AIDATA device specifications for Android Compose previews.
 *
 * This extension provides AIDATA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AIDATA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AIDATA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AIDATA, code=ADT1012L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIDATA, code=ADT1012L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ADT1012L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AIDATA, code=ADT1061, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIDATA, code=ADT1061, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val ADT1061 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIDATA, code=ADT1061_1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIDATA, code=ADT1061_1, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ADT1061_1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AIDATA, code=ADT_1061, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIDATA, code=ADT_1061, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ADT_1061 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AIDATA, code=ADT-R10TME, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIDATA, code=ADT-R10TME,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val ADT_R10TME = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
