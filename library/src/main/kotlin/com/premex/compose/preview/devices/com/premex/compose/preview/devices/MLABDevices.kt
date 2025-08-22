package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MLAB device specifications for Android Compose previews.
 *
 * This extension provides MLAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MLAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MLAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=MLAB, code=MB4_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=MB4_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MB4_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLAB, code=MB4_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=MB4_WIFI, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MB4_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLAB, code=MB8866, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=MB8866, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MB8866 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLAB, code=9095, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=9095, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _9095 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MLAB, code=9096, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=9096, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val _9096 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MLAB, code=9098, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=9098, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _9098 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MLAB, code=9342, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=9342, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val _9342 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MLAB, code=9343, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=9343, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _9343 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MLAB, code=9344, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MLAB, code=9344, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _9344 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
