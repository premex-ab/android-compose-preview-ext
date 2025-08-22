package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LANGO device specifications for Android Compose previews.
 *
 * This extension provides LANGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LANGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LANGO: Any
  get() = object {
      /** DeviceSpec(manufacturer=LANGO, code=OPS-8195A, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LANGO, code=OPS-8195A, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val OPS_8195A = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
