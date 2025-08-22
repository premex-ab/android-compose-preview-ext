package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hometech device specifications for Android Compose previews.
 *
 * This extension provides Hometech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hometech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hometech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hometech, code=Alfa10LT, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hometech, code=Alfa10LT, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val ALFA10LT = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Hometech, code=ALFA10MX, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hometech, code=ALFA10MX, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ALFA10MX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hometech, code=Alfa_11_BT, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hometech, code=Alfa_11_BT,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val ALFA_11_BT = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Hometech, code=Alfa_12_GX_Pro, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hometech, code=Alfa_12_GX_Pro,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val ALFA_12_GX_PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Hometech, code=ALFA_7M, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hometech, code=ALFA_7M, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ALFA_7M = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hometech, code=HT_8MZ, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hometech, code=HT_8MZ, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HT_8MZ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hometech, code=mid1032_mr_32, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hometech, code=mid1032_mr_32,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1032_MR_32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hometech, code=mid7015_32, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hometech, code=mid7015_32,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7015_32 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
