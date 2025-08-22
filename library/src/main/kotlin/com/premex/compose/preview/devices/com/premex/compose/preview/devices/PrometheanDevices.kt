package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Promethean device specifications for Android Compose previews.
 *
 * This extension provides Promethean device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Promethean.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Promethean: Any
  get() = object {
      /** DeviceSpec(manufacturer=Promethean, code=OPS-A2, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Promethean, code=OPS-A2,
      width=2160, height=3840, dpi=320, isGoogleDevice=false).code */
      val OPS_A2 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Promethean, code=XM3566D, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Promethean, code=XM3566D,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val XM3566D = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
