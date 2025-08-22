package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Inco device specifications for Android Compose previews.
 *
 * This extension provides Inco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inco: Any
  get() = object {
      /** DeviceSpec(manufacturer=Inco, code=eco_s, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Inco, code=eco_s, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ECO_S = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Inco, code=Horizon_S, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Inco, code=Horizon_S, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val HORIZON_S = "spec:width=720,height=1520,unit=px,dpi=320"

  }
