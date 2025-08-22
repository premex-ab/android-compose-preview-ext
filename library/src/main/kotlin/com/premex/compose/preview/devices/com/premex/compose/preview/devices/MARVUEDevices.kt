package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MARVUE device specifications for Android Compose previews.
 *
 * This extension provides MARVUE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MARVUE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MARVUE: Any
  get() = object {
      /** DeviceSpec(manufacturer=MARVUE, code=Kidpa_M7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=Kidpa_M7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDPA_M7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MARVUE, code=M11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=M11, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MARVUE, code=M12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=M12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MARVUE, code=M15, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=M15, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M15 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MARVUE, code=M8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=M8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MARVUE, code=M81, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=M81, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M81 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MARVUE, code=M8_Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=M8_Pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M8_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MARVUE, code=Pad_M10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=Pad_M10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PAD_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MARVUE, code=Pad_M30, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MARVUE, code=Pad_M30, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PAD_M30 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
