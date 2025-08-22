package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Teknosa device specifications for Android Compose previews.
 *
 * This extension provides Teknosa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teknosa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teknosa: Any
  get() = object {
      /** DeviceSpec(manufacturer=Teknosa, code=Preo_P2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teknosa, code=Preo_P2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PREO_P2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
