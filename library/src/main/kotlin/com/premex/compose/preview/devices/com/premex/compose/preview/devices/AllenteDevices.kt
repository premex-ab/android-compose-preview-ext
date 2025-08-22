package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Allente device specifications for Android Compose previews.
 *
 * This extension provides Allente device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Allente.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Allente: Any
  get() = object {
      /** DeviceSpec(manufacturer=Allente, code=SEI700ALLG, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Allente, code=SEI700ALLG,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700ALLG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
