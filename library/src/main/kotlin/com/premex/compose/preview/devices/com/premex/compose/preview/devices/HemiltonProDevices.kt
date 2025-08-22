package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HemiltonPro device specifications for Android Compose previews.
 *
 * This extension provides HemiltonPro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HemiltonPro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HemiltonPro: Any
  get() = object {
      /** DeviceSpec(manufacturer=HemiltonPro, code=Tab1000, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HemiltonPro, code=Tab1000,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val TAB1000 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
