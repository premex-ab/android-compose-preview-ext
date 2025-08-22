package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tigorr device specifications for Android Compose previews.
 *
 * This extension provides Tigorr device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tigorr.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tigorr: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tigorr, code=Z7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tigorr, code=Z7, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z7 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
