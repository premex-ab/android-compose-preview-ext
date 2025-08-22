package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOUCHMATE device specifications for Android Compose previews.
 *
 * This extension provides TOUCHMATE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOUCHMATE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOUCHMATE: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1010, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1010,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TM_MID1010 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1010NB, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1010NB,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TM_MID1010NB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1050B, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1050B,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TM_MID1050B = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1065, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1065,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TM_MID1065 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1080, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID1080,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TM_MID1080 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID880PRO, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOUCHMATE, code=TM-MID880PRO,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val TM_MID880PRO = "spec:width=800,height=1280,unit=px,dpi=240"

  }
