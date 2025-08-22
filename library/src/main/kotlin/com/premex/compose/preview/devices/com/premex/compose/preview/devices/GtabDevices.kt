package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-tab device specifications for Android Compose previews.
 *
 * This extension provides G-tab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gtab: Any
  get() = object {
      /** DeviceSpec(manufacturer=G-tab, code=F10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-tab, code=F10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-tab, code=Q5, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-tab, code=Q5, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q5 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-tab, code=S3, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-tab, code=S3, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-tab, code=Tablet, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-tab, code=Tablet, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

  }
