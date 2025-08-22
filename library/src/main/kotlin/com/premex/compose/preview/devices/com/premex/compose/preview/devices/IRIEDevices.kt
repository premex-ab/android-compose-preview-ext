package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRIE device specifications for Android Compose previews.
 *
 * This extension provides IRIE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRIE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRIE: Any
  get() = object {
      /** DeviceSpec(manufacturer=IRIE, code=FFF-TAB10H, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRIE, code=FFF-TAB10H, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val FFF_TAB10H = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
