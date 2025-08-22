package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xwave device specifications for Android Compose previews.
 *
 * This extension provides Xwave device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xwave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xwave: Any
  get() = object {
      /** DeviceSpec(manufacturer=Xwave, code=Xpad, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xwave, code=Xpad, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val XPAD = "spec:width=600,height=1024,unit=px,dpi=160"

  }
