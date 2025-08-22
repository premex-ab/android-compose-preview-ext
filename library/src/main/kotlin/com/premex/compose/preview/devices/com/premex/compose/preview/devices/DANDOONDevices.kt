package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DANDOON device specifications for Android Compose previews.
 *
 * This extension provides DANDOON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DANDOON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DANDOON: Any
  get() = object {
      /** DeviceSpec(manufacturer=DANDOON, code=A2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DANDOON, code=A2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val A2 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
