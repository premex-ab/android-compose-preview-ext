package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNISCED device specifications for Android Compose previews.
 *
 * This extension provides UNISCED device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNISCED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNISCED: Any
  get() = object {
      /** DeviceSpec(manufacturer=UNISCED, code=UNISCEDTAB24, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNISCED, code=UNISCEDTAB24,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val UNISCEDTAB24 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
