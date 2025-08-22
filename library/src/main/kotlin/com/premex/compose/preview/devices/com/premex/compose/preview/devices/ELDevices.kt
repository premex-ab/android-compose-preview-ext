package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EL device specifications for Android Compose previews.
 *
 * This extension provides EL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EL: Any
  get() = object {
      /** DeviceSpec(manufacturer=EL, code=D60_Pro, width=600, height=1280, dpi=315,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=D60_Pro, width=600,
      height=1280, dpi=315, isGoogleDevice=false).code */
      val D60_PRO = "spec:width=600,height=1280,unit=px,dpi=315"

      /** DeviceSpec(manufacturer=EL, code=D68, width=720, height=1560, dpi=380,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=D68, width=720,
      height=1560, dpi=380, isGoogleDevice=false).code */
      val D68 = "spec:width=720,height=1560,unit=px,dpi=380"

      /** DeviceSpec(manufacturer=EL, code=Pad-S11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=Pad-S11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD_S11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EL, code=Pad_S7, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=Pad_S7, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD_S7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EL, code=Pad_S8, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=Pad_S8, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PAD_S8 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EL, code=X60_PRO, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=X60_PRO, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val X60_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EL, code=X70, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=X70, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val X70 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EL, code=X80, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=X80, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val X80 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=EL, code=Y10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=Y10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EL, code=6AT, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=6AT, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val _6AT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=EL, code=6CS, width=240, height=296, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EL, code=6CS, width=240,
      height=296, dpi=120, isGoogleDevice=false).code */
      val _6CS = "spec:width=240,height=296,unit=px,dpi=120"

  }
