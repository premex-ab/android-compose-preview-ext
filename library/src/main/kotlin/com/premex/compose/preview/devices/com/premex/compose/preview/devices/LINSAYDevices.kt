package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LINSAY device specifications for Android Compose previews.
 *
 * This extension provides LINSAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LINSAY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LINSAY: Any
  get() = object {
      /** DeviceSpec(manufacturer=LINSAY, code=F10XIPG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LINSAY, code=F10XIPG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F10XIPG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LINSAY, code=F10XIPS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LINSAY, code=F10XIPS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F10XIPS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LINSAY, code=F10XIPSQ, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LINSAY, code=F10XIPSQ, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F10XIPSQ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LINSAY, code=F7UHD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LINSAY, code=F7UHD, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val F7UHD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LINSAY, code=F_10XIPS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LINSAY, code=F_10XIPS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F_10XIPS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LINSAY, code=LINSAY-F7HD4CORE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LINSAY, code=LINSAY-F7HD4CORE,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LINSAY_F7HD4CORE = "spec:width=600,height=1024,unit=px,dpi=160"

  }
