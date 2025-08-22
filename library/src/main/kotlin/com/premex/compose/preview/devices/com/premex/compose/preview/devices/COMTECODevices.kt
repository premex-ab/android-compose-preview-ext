package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COMTECO device specifications for Android Compose previews.
 *
 * This extension provides COMTECO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COMTECO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COMTECO: Any
  get() = object {
      /** DeviceSpec(manufacturer=COMTECO, code=DV8535-KBC, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMTECO, code=DV8535-KBC,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8535_KBC = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
