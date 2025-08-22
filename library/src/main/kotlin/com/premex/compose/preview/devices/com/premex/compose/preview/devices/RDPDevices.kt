package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RDP device specifications for Android Compose previews.
 *
 * This extension provides RDP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RDP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RDP: Any
  get() = object {
      /** DeviceSpec(manufacturer=RDP, code=TP802, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RDP, code=TP802, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TP802 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
