package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * kaliho device specifications for Android Compose previews.
 *
 * This extension provides kaliho device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kaliho.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kaliho: Any
  get() = object {
      /** DeviceSpec(manufacturer=kaliho, code=H3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=kaliho, code=H3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val H3 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
