package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EASYTECK device specifications for Android Compose previews.
 *
 * This extension provides EASYTECK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EASYTECK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EASYTECK: Any
  get() = object {
      /** DeviceSpec(manufacturer=EASYTECK, code=EK10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EASYTECK, code=EK10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EK10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
