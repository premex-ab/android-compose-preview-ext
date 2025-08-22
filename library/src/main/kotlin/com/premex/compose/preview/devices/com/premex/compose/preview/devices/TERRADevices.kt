package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TERRA device specifications for Android Compose previews.
 *
 * This extension provides TERRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TERRA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TERRA: Any
  get() = object {
      /** DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1005, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1005,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TERRA_PAD_1005 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1005POKO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1005POKO,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TERRA_PAD_1005POKO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1006, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1006,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TERRA_PAD_1006 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1006_V2, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1006_V2,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TERRA_PAD_1006_V2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1007, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1007,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TERRA_PAD_1007 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1201, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TERRA, code=TERRA_PAD_1201,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val TERRA_PAD_1201 = "spec:width=1600,height=2560,unit=px,dpi=320"

  }
