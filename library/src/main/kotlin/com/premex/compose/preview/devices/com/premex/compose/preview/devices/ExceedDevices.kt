package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Exceed device specifications for Android Compose previews.
 *
 * This extension provides Exceed device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Exceed.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Exceed: Any
  get() = object {
      /** DeviceSpec(manufacturer=Exceed, code=Exceed_E22, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Exceed, code=Exceed_E22, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val EXCEED_E22 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
