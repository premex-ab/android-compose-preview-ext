package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YOSHIRO device specifications for Android Compose previews.
 *
 * This extension provides YOSHIRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YOSHIRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YOSHIRO: Any
  get() = object {
      /** DeviceSpec(manufacturer=YOSHIRO, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOSHIRO, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YOSHIRO, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOSHIRO, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
