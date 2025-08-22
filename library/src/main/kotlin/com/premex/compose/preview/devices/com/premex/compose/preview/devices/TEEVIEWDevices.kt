package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TEEVIEW device specifications for Android Compose previews.
 *
 * This extension provides TEEVIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TEEVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TEEVIEW: Any
  get() = object {
      /** DeviceSpec(manufacturer=TEEVIEW, code=nagai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TEEVIEW, code=nagai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
