package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * redway device specifications for Android Compose previews.
 *
 * This extension provides redway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Redway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Redway: Any
  get() = object {
      /** DeviceSpec(manufacturer=redway, code=redway10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redway, code=redway10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val REDWAY10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=redway, code=redway10_lite, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redway, code=redway10_lite,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val REDWAY10_LITE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=redway, code=redway7_pro, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redway, code=redway7_pro,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val REDWAY7_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
