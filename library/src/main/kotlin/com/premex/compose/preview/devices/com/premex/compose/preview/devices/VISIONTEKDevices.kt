package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VISIONTEK device specifications for Android Compose previews.
 *
 * This extension provides VISIONTEK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VISIONTEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VISIONTEK: Any
  get() = object {
      /** DeviceSpec(manufacturer=VISIONTEK, code=VT_31, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VISIONTEK, code=VT_31, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val VT_31 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
