package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Technika device specifications for Android Compose previews.
 *
 * This extension provides Technika device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Technika.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Technika: Any
  get() = object {
      /** DeviceSpec(manufacturer=Technika, code=ewha, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technika, code=ewha, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
