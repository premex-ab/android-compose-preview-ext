package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PHOENIX device specifications for Android Compose previews.
 *
 * This extension provides PHOENIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PHOENIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PHOENIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=PHOENIX, code=PHPHOENIXONETAB, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHOENIX, code=PHPHOENIXONETAB,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PHPHOENIXONETAB = "spec:width=800,height=1280,unit=px,dpi=160"

  }
