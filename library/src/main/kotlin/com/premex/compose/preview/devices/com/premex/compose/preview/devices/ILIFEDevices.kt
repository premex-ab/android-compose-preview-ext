package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * I-LIFE device specifications for Android Compose previews.
 *
 * This extension provides I-LIFE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ILIFE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ILIFE: Any
  get() = object {
      /** DeviceSpec(manufacturer=I-LIFE, code=MISA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=I-LIFE, code=MISA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MISA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
