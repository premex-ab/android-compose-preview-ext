package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HIGRACE device specifications for Android Compose previews.
 *
 * This extension provides HIGRACE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HIGRACE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HIGRACE: Any
  get() = object {
      /** DeviceSpec(manufacturer=HIGRACE, code=G15, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIGRACE, code=G15, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G15 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HIGRACE, code=OC101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIGRACE, code=OC101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val OC101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HIGRACE, code=OC101_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIGRACE, code=OC101_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val OC101_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
