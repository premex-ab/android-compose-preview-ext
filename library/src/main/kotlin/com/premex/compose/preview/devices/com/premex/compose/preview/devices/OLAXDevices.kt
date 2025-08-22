package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OLAX device specifications for Android Compose previews.
 *
 * This extension provides OLAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OLAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OLAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=OLAX, code=Magic_Q1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLAX, code=Magic_Q1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MAGIC_Q1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OLAX, code=Magic_Q8, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLAX, code=Magic_Q8, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val MAGIC_Q8 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=OLAX, code=Ocean_F8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLAX, code=Ocean_F8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OCEAN_F8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OLAX, code=Ocean_K10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLAX, code=Ocean_K10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val OCEAN_K10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OLAX, code=Ocean_K8, width=800, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLAX, code=Ocean_K8, width=800,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val OCEAN_K8 = "spec:width=800,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OLAX, code=Ocean_K8_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OLAX, code=Ocean_K8_Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OCEAN_K8_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
