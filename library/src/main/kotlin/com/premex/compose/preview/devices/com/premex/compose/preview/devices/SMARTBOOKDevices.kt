package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMARTBOOK device specifications for Android Compose previews.
 *
 * This extension provides SMARTBOOK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTBOOK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTBOOK: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMARTBOOK, code=S104G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMARTBOOK, code=S104G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S104G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SMARTBOOK, code=S204G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMARTBOOK, code=S204G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S204G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
