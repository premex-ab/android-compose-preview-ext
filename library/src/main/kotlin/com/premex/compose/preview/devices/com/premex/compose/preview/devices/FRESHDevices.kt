package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FRESH device specifications for Android Compose previews.
 *
 * This extension provides FRESH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FRESH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FRESH: Any
  get() = object {
      /** DeviceSpec(manufacturer=FRESH, code=R3_GTV, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FRESH, code=R3_GTV, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FRESH, code=shinagawa, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FRESH, code=shinagawa, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FRESH, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FRESH, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
