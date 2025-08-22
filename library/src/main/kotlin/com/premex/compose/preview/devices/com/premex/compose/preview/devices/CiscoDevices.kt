package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cisco device specifications for Android Compose previews.
 *
 * This extension provides Cisco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cisco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cisco: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cisco, code=CP-DX80, width=1032, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cisco, code=CP-DX80, width=1032,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val CP_DX80 = "spec:width=1032,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cisco, code=860, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cisco, code=860, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _860 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
