package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Consung device specifications for Android Compose previews.
 *
 * This extension provides Consung device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Consung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Consung: Any
  get() = object {
      /** DeviceSpec(manufacturer=Consung, code=N101B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Consung, code=N101B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val N101B = "spec:width=800,height=1280,unit=px,dpi=160"

  }
