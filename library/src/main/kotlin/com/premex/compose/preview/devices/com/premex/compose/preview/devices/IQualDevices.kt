package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iQual device specifications for Android Compose previews.
 *
 * This extension provides iQual device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IQual.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IQual: Any
  get() = object {
      /** DeviceSpec(manufacturer=iQual, code=T10G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQual, code=T10G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iQual, code=T10L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQual, code=T10L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T10L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iQual, code=T10W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQual, code=T10W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iQual, code=T7G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQual, code=T7G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T7G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iQual, code=T7L, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQual, code=T7L, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val T7L = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iQual, code=T7W, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQual, code=T7W, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T7W = "spec:width=600,height=1024,unit=px,dpi=160"

  }
