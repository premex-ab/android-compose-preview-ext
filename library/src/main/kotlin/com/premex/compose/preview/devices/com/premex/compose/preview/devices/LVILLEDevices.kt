package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LVILLE device specifications for Android Compose previews.
 *
 * This extension provides LVILLE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LVILLE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LVILLE: Any
  get() = object {
      /** DeviceSpec(manufacturer=LVILLE, code=TP1005, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LVILLE, code=TP1005, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TP1005 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LVILLE, code=TPC1013, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LVILLE, code=TPC1013, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TPC1013 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LVILLE, code=TPC1013_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LVILLE, code=TPC1013_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TPC1013_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
