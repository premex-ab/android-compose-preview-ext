package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Amobile device specifications for Android Compose previews.
 *
 * This extension provides Amobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Amobile, code=PD602, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Amobile, code=PD602, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val PD602 = "spec:width=720,height=1440,unit=px,dpi=280"

  }
