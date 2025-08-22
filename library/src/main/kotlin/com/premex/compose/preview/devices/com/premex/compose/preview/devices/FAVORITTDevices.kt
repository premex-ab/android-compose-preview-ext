package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FAVORITT device specifications for Android Compose previews.
 *
 * This extension provides FAVORITT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FAVORITT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FAVORITT: Any
  get() = object {
      /** DeviceSpec(manufacturer=FAVORITT, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FAVORITT, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FAVORITT, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FAVORITT, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
