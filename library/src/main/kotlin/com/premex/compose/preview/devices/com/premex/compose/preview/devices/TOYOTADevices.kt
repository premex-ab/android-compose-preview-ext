package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOYOTA device specifications for Android Compose previews.
 *
 * This extension provides TOYOTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOYOTA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOYOTA: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOYOTA, code=TSA, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOYOTA, code=TSA, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val TSA = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
