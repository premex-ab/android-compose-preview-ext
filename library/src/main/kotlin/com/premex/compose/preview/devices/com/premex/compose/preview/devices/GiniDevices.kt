package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gini device specifications for Android Compose previews.
 *
 * This extension provides Gini device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gini.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gini: Any
  get() = object {
      /** DeviceSpec(manufacturer=Gini, code=e6_plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gini, code=e6_plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Gini, code=Gini_s5Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gini, code=Gini_s5Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GINI_S5PRO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
