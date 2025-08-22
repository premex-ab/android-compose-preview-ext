package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Geniatech device specifications for Android Compose previews.
 *
 * This extension provides Geniatech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geniatech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geniatech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Geniatech, code=enjoytv, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Geniatech, code=enjoytv,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ENJOYTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
