package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * My device specifications for Android Compose previews.
 *
 * This extension provides My device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.My.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.My: Any
  get() = object {
      /** DeviceSpec(manufacturer=My, code=tokyo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=My, code=tokyo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TOKYO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=My, code=yeoksam, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=My, code=yeoksam, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YEOKSAM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
