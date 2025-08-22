package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZONMAI device specifications for Android Compose previews.
 *
 * This extension provides ZONMAI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZONMAI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZONMAI: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZONMAI, code=MX2_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZONMAI, code=MX2_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MX2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
