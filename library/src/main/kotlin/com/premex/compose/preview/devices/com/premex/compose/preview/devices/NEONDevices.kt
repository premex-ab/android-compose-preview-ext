package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEON device specifications for Android Compose previews.
 *
 * This extension provides NEON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEON: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEON, code=Neon_Tab_11, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEON, code=Neon_Tab_11, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val NEON_TAB_11 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
