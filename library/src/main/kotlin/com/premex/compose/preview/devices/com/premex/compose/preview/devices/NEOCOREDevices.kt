package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEOCORE device specifications for Android Compose previews.
 *
 * This extension provides NEOCORE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEOCORE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEOCORE: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEOCORE, code=NEOCORE-E2S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEOCORE, code=NEOCORE-E2S,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NEOCORE_E2S = "spec:width=800,height=1280,unit=px,dpi=160"

  }
