package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZDK device specifications for Android Compose previews.
 *
 * This extension provides ZDK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZDK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZDK: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZDK, code=ZDKMP-T30A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZDK, code=ZDKMP-T30A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ZDKMP_T30A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZDK, code=ZDKMP-T30B, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZDK, code=ZDKMP-T30B, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZDKMP_T30B = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
