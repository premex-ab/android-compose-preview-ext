package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 3Rtablet device specifications for Android Compose previews.
 *
 * This extension provides 3Rtablet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._3Rtablet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._3Rtablet: Any
  get() = object {
      /** DeviceSpec(manufacturer=3Rtablet, code=VT-7GE, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=3Rtablet, code=VT-7GE, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val VT_7GE = "spec:width=800,height=1280,unit=px,dpi=240"

  }
