package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Elecson device specifications for Android Compose previews.
 *
 * This extension provides Elecson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elecson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elecson: Any
  get() = object {
      /** DeviceSpec(manufacturer=Elecson, code=PrimeX1, width=720, height=1640, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elecson, code=PrimeX1, width=720,
      height=1640, dpi=340, isGoogleDevice=false).code */
      val PRIMEX1 = "spec:width=720,height=1640,unit=px,dpi=340"

  }
