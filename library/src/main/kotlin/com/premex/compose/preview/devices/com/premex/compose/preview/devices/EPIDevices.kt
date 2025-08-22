package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EPI device specifications for Android Compose previews.
 *
 * This extension provides EPI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EPI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EPI: Any
  get() = object {
      /** DeviceSpec(manufacturer=EPI, code=TAB-001, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPI, code=TAB-001, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_001 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
