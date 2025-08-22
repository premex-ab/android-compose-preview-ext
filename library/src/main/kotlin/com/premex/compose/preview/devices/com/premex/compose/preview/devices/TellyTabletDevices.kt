package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TellyTablet device specifications for Android Compose previews.
 *
 * This extension provides TellyTablet device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TellyTablet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TellyTablet: Any
  get() = object {
      /** DeviceSpec(manufacturer=TellyTablet, code=VM_MD_001, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TellyTablet, code=VM_MD_001,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val VM_MD_001 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
