package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JAY-tech device specifications for Android Compose previews.
 *
 * This extension provides JAY-tech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JAYtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JAYtech: Any
  get() = object {
      /** DeviceSpec(manufacturer=JAY-tech, code=TPC-G1010_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JAY-tech, code=TPC-G1010_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TPC_G1010_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JAY-tech, code=TPC-G1011LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JAY-tech, code=TPC-G1011LTE,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TPC_G1011LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JAY-tech, code=TPC-G109, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JAY-tech, code=TPC-G109, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TPC_G109 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
