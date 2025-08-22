package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fiteye device specifications for Android Compose previews.
 *
 * This extension provides Fiteye device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fiteye.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fiteye: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fiteye, code=FIT-32, width=1080, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fiteye, code=FIT-32, width=1080,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val FIT_32 = "spec:width=1080,height=1920,unit=px,dpi=280"

  }
