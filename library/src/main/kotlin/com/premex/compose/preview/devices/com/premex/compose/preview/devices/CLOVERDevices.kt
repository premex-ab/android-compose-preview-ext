package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CLOVER device specifications for Android Compose previews.
 *
 * This extension provides CLOVER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CLOVER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CLOVER: Any
  get() = object {
      /** DeviceSpec(manufacturer=CLOVER, code=KD101, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CLOVER, code=KD101, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val KD101 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
