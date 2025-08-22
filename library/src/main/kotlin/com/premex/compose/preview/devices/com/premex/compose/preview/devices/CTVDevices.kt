package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CTV device specifications for Android Compose previews.
 *
 * This extension provides CTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=CTV, code=SEI700CG, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CTV, code=SEI700CG, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SEI700CG = "spec:width=720,height=1280,unit=px,dpi=320"

  }
