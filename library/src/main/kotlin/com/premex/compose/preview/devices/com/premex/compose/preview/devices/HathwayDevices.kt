package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hathway device specifications for Android Compose previews.
 *
 * This extension provides Hathway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hathway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hathway: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hathway, code=SEI103, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hathway, code=SEI103, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SEI103 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hathway, code=SEI111H, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hathway, code=SEI111H, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SEI111H = "spec:width=720,height=1280,unit=px,dpi=213"

  }
