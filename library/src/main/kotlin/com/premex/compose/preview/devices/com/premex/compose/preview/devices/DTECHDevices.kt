package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * D-TECH device specifications for Android Compose previews.
 *
 * This extension provides D-TECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=D-TECH, code=DT07, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=D-TECH, code=DT07, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val DT07 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=D-TECH, code=DT08-TAB4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=D-TECH, code=DT08-TAB4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DT08_TAB4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=D-TECH, code=DT10-TAB4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=D-TECH, code=DT10-TAB4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DT10_TAB4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=D-TECH, code=DT10-TAB4G-T101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=D-TECH, code=DT10-TAB4G-T101,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val DT10_TAB4G_T101 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
