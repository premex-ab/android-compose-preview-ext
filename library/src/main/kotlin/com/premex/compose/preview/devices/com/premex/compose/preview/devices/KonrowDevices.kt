package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Konrow device specifications for Android Compose previews.
 *
 * This extension provides Konrow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Konrow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Konrow: Any
  get() = object {
      /** DeviceSpec(manufacturer=Konrow, code=KTAB_1003, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Konrow, code=KTAB_1003, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KTAB_1003 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Konrow, code=KTAB_1004, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Konrow, code=KTAB_1004, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KTAB_1004 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Konrow, code=Sky, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Konrow, code=Sky, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SKY = "spec:width=640,height=1280,unit=px,dpi=320"

  }
