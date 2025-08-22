package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SURTAB device specifications for Android Compose previews.
 *
 * This extension provides SURTAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SURTAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SURTAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=SURTAB, code=SURTAB_74G, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SURTAB, code=SURTAB_74G, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SURTAB_74G = "spec:width=720,height=1280,unit=px,dpi=160"

  }
