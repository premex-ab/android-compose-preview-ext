package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Datamini device specifications for Android Compose previews.
 *
 * This extension provides Datamini device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Datamini.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Datamini: Any
  get() = object {
      /** DeviceSpec(manufacturer=Datamini, code=T104G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datamini, code=T104G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T104G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Datamini, code=T104G_T610, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datamini, code=T104G_T610,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val T104G_T610 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Datamini, code=T8004G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datamini, code=T8004G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8004G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Datamini, code=T84G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datamini, code=T84G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T84G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Datamini, code=T84G_T310, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datamini, code=T84G_T310,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val T84G_T310 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Datamini, code=T84G_T310_332, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datamini, code=T84G_T310_332,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val T84G_T310_332 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Datamini, code=TPOS74G-IGF720, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datamini, code=TPOS74G-IGF720,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TPOS74G_IGF720 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
