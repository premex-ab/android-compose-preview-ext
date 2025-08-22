package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VETOO device specifications for Android Compose previews.
 *
 * This extension provides VETOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VETOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VETOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=VETOO, code=T4GB07, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VETOO, code=T4GB07, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T4GB07 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VETOO, code=T4GB10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VETOO, code=T4GB10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T4GB10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VETOO, code=TWIFIB07, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VETOO, code=TWIFIB07, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TWIFIB07 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VETOO, code=V10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VETOO, code=V10, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val V10 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
