package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Billion device specifications for Android Compose previews.
 *
 * This extension provides Billion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Billion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Billion: Any
  get() = object {
      /** DeviceSpec(manufacturer=Billion, code=rimoB, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Billion, code=rimoB, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RIMOB = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
