package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WE device specifications for Android Compose previews.
 *
 * This extension provides WE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WE: Any
  get() = object {
      /** DeviceSpec(manufacturer=WE, code=A10, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=A10, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WE, code=A50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=A50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WE, code=F1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=F1, width=480, height=960,
      dpi=240, isGoogleDevice=false).code */
      val F1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WE, code=L7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=L7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WE, code=V5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=V5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WE, code=WE_F20, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=WE_F20, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val WE_F20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WE, code=WE_L9, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=WE_L9, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val WE_L9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WE, code=WE_R4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=WE_R4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val WE_R4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WE, code=WE_T1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WE, code=WE_T1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val WE_T1 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
