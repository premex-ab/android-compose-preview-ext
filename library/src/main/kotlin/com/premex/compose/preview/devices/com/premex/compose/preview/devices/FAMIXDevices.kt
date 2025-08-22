package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FAMIX device specifications for Android Compose previews.
 *
 * This extension provides FAMIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FAMIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FAMIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=FAMIX, code=F10L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FAMIX, code=F10L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F10L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FAMIX, code=F11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FAMIX, code=F11, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F11 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
