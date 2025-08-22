package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QUATRO device specifications for Android Compose previews.
 *
 * This extension provides QUATRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QUATRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QUATRO: Any
  get() = object {
      /** DeviceSpec(manufacturer=QUATRO, code=Quatro_8, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QUATRO, code=Quatro_8, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val QUATRO_8 = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
