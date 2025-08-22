package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bea-fon device specifications for Android Compose previews.
 *
 * This extension provides Bea-fon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beafon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beafon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bea-fon, code=MX1, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bea-fon, code=MX1, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val MX1 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
